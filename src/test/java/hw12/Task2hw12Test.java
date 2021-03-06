package hw12;

import hw13.Task2;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2hw12Test {

    @Test
    public void numIdenticalPairs1() {
        Task2hw12 object = new Task2hw12();
        assertEquals(4, object.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }
    @Test
    public void numIdenticalPairs2() {
        Task2hw12 object = new Task2hw12();
        assertEquals(0, object.numIdenticalPairs(new int[]{1, 2, 3}));
    }

    @Test
    public void numIdenticalPairs3() {
        Task2hw12 object = new Task2hw12();
        assertEquals(6, object.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void numIdenticalPairs4() {
        Task2hw12 object = new Task2hw12();
        assertNotEquals(2, object.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }
}