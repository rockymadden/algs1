package algs1.week2;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import algs1.week2.Quick;

public class QuickTest {
    @Test
    public void shouldWork() {
        Integer[] a = new Integer[] {3, 4, 4, 5, 1};
        Integer[] expected = new Integer[] {1, 3, 4, 4, 5};

        Quick.sort(a);

        assertArrayEquals(expected, a);
    }
}
