package algs1.week1.quiz;

import static org.junit.Assert.*;
import org.junit.Test;
import algs1.week1.quiz.Question1;

public class Question1Test {
    @Test
    public void shouldWork() {
        Question1 q1 = new Question1(10);

        assertFalse(q1.allConnected());

        q1.union(0, 1);

        assertFalse(q1.allConnected());

        q1.union(1, 2);
        q1.union(2, 3);
        q1.union(3, 4);
        q1.union(4, 5);
        q1.union(5, 6);
        q1.union(6, 7);
        q1.union(7, 8);
        q1.union(8, 9);

        assertTrue(q1.allConnected());
    }
}