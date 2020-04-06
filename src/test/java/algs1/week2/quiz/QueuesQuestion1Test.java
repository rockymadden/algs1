package algs1.week2.quiz;

import static org.junit.Assert.*;
import org.junit.Test;
import algs1.week2.quiz.QueuesQuestion1;

public class QueuesQuestion1Test {
    @Test
    public void shouldWork() {
        QueuesQuestion1<Integer> q1 = new QueuesQuestion1<Integer>();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        assertTrue(q1.dequeue() == 1);
        assertTrue(q1.dequeue() == 2);
        assertTrue(q1.dequeue() == 3);
        assertTrue(q1.dequeue() == 4);

        q1.enqueue(1);
        q1.enqueue(2);
        assertTrue(q1.dequeue() == 1);
        assertTrue(q1.dequeue() == 2);
        q1.enqueue(3);
        q1.enqueue(4);
        assertTrue(q1.dequeue() == 3);
        assertTrue(q1.dequeue() == 4);
    }
}
