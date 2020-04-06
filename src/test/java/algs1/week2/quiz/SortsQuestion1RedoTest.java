package algs1.week2.quiz;

import static org.junit.Assert.*;
import org.junit.Test;

public class SortsQuestion1RedoTest {
    @Test
    public void shouldWorkSymetrically() {
        Integer[] a = SortsQuestion1Redo.intersect(
            new Integer[] {1, 2, 2, 3},
            new Integer[] {2, 1, 1, 4, 2}
        );
        Integer[] b = SortsQuestion1Redo.intersect(
            new Integer[] {2, 1, 1, 4, 2},
            new Integer[] {1, 2, 2, 3}
        );

        assertArrayEquals(a, new Integer[] {1, 2, 2});
        assertArrayEquals(b, new Integer[] {1, 2, 2});
    }

    @Test
    public void shouldWorkWithOneEmpty() {
        Integer[] a = SortsQuestion1Redo.intersect(
            new Integer[] {1, 2, 2, 3},
            new Integer[] {}
        );
        Integer[] b = SortsQuestion1Redo.intersect(
            new Integer[] {},
            new Integer[] {2, 1, 1, 4}
        );

        assertArrayEquals(a, new Integer[] {});
        assertArrayEquals(b, new Integer[] {});
    }
}
