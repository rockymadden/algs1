package algs1.week1;

import static org.junit.Assert.*;
import org.junit.Test;
import algs1.week1.WeightedQuickUnion;

public class WeightedQuickUnionTest {
    @Test
    public void shouldWork() {
        WeightedQuickUnion qu = new WeightedQuickUnion(10);
        qu.union(0, 1);
        qu.union(1, 3);
        qu.union(3, 4);
        qu.union(5, 6);

        assertTrue(qu.connected(0, 4));
        assertTrue(qu.connected(1, 4));
        assertFalse(qu.connected(1, 5));
    }
}