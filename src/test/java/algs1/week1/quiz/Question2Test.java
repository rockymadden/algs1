package algs1.week1.quiz;

import static org.junit.Assert.*;
import org.junit.Test;
import algs1.week1.quiz.Question2;

public class Question2Test {
    @Test
    public void shouldWork() {
        Question2 q2 = new Question2(10);
        q2.union(1, 2);
        q2.union(6, 9);
        q2.union(2, 6);
        q2.union(7, 8);

        assertEquals(q2.find(0), 0);
        assertEquals(q2.find(1), 9);
        assertEquals(q2.find(2), 9);
        assertEquals(q2.find(6), 9);
        assertEquals(q2.find(9), 9);
        assertEquals(q2.find(7), 8);
        assertEquals(q2.find(8), 8);
    }
}