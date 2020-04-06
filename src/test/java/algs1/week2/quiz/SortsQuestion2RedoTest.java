package algs1.week2.quiz;

import static org.junit.Assert.*;
import org.junit.Test;
import static algs1.week2.quiz.SortsQuestion2Redo.permutation;

public class SortsQuestion2RedoTest {
    @Test
    public void shouldWork() {
        assertTrue(permutation(new Integer[] {1}, new Integer[] {1}));
        assertTrue(permutation(new Integer[] {1, 2, 2, 3}, new Integer[] {2, 1, 2, 3}));
        assertFalse(permutation(new Integer[] {1, 2, 2}, new Integer[] {2, 1, 2, 3}));
        assertFalse(permutation(new Integer[] {}, new Integer[] {2, 1, 2, 3}));

    }
}
