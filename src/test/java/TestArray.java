import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestArray {
    private ArrayListExample arrayListExample;

    @Before
    public void before(){
        ArrayList<Integer> Mynumbers = new ArrayList<>();
        Mynumbers.add(1);
        Mynumbers.add(2);
        Mynumbers.add(3);
        Mynumbers.add(4);
        arrayListExample = new ArrayListExample(Mynumbers);
    }

    @Test
    public void canAddItem(){
        arrayListExample.add("Hello");
        assertEquals(1, arrayListExample.getWordCount());
    }

    @Test
    public void canTotalNumbers(){
        assertEquals(10, arrayListExample.getTotal());
    }

    @Test
    public void canGetRandomNumber(){
        ArrayList results = arrayListExample.getNumbers();
        int randomNumber = arrayListExample.getRandomNumber();
        assertTrue(results.contains(randomNumber));
    }
}