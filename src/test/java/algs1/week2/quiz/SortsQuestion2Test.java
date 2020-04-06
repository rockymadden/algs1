package algs1.week2.quiz;

import static org.junit.Assert.*;
import org.junit.Test;
import algs1.week2.quiz.SortsQuestion2;

public class SortsQuestion2Test {
    @Test
    public void shouldWork() {
        assertTrue(SortsQuestion2.permutation(new int[] {1}, new int[] {1}));
        assertTrue(SortsQuestion2.permutation(new int[] {1, 2, 2, 3}, new int[] {2, 1, 2, 3}));
        assertFalse(SortsQuestion2.permutation(new int[] {1, 2, 2}, new int[] {2, 1, 2, 3}));
    }
}
