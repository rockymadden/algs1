package algs1.week2.quiz;

import static org.junit.Assert.*;
import org.junit.Test;
import algs1.week2.quiz.SortsQuestion1;

public class SortsQuestion1Test {
    @Test
    public void shouldWork() {
        int[] a = SortsQuestion1.intersect(new int[] {1, 2, 2, 3}, new int[] {2, 1, 1, 4});

        assertArrayEquals(a, new int[] {2, 1, 1});
    }
}
