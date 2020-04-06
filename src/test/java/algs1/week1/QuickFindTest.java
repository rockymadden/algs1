package algs1.week1;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import algs1.week1.QuickFind;

public class QuickFindTest {
    @Test
    public void shouldConstruct() {
        QuickFind qf = new QuickFind(10);
        assertTrue(qf != null);
    }

    @Test
    public void shouldUnion() {
        QuickFind qf = new QuickFind(10);
        qf.union(0, 1);
        qf.union(1, 2);

        assertTrue(qf.connected(0, 1));
        assertTrue(qf.connected(1, 2));
        assertTrue(qf.connected(0, 2));
    }
}