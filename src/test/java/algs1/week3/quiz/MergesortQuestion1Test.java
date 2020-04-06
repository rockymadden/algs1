package algs1.week3.quiz;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import static algs1.week3.quiz.MergesortQuestion1.sort;

public class MergesortQuestion1Test {
    @Test
    public void shouldWork() {
        Integer[] toSort;

        toSort = new Integer[] {3, 2, 1};
        sort(toSort);
        assertArrayEquals(new Integer[] {1, 2, 3}, toSort);

        toSort = new Integer[] {8, 9, 1, 2};
        sort(toSort);
        assertArrayEquals(new Integer[] {1, 2, 8, 9}, toSort);

        toSort = new Integer[] {1, 2, 8, 9};
        sort(toSort);
        assertArrayEquals(new Integer[] {1, 2, 8, 9}, toSort);

        toSort = new Integer[] {5, 6, 1, 2, 4, 9, 0, 8};
        sort(toSort);
        assertArrayEquals(new Integer[] {0, 1, 2, 4, 5, 6, 8, 9}, toSort);
    }
}
