package algs1.week2.quiz;

import static org.junit.Assert.*;
import org.junit.Test;
import algs1.week2.quiz.QueuesQuestion2;

public class QueuesQuestion2Test {
    @Test
    public void shouldWork() {
        QueuesQuestion2 q2 = new QueuesQuestion2();
        q2.push(1);
        assertTrue(q2.max() == 1);
        q2.push(2);
        assertTrue(q2.max() == 2);
        q2.pop();
        assertTrue(q2.max() == 1);
        q2.push(3);
        assertTrue(q2.max() == 3);
        q2.push(4);
        assertTrue(q2.max() == 4);
        q2.pop();
        assertTrue(q2.max() == 3);
    }
}
