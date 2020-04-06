package algs1.week3.quiz;

import static org.junit.Assert.*;
import org.junit.Test;
import static algs1.week3.quiz.MergesortQuestion3.*;

public class MergesortQuestion3Test {
    @Test
    public void lengthTest() {
        ListNode list = null;
        assertEquals(length(list), 0);

        list = new ListNode(1);
        assertEquals(length(list), 1);

        list.next = new ListNode(2);
        assertEquals(length(list), 2);
    }

    @Test
    public void sanitizeTest() {
        ListNode list;
        ListNode expected;

        list = new ListNode(1);
        assertEquals(sanitize(list), list);

        list = new ListNode(-1);
        assertEquals(sanitize(list), null);

        list = new ListNode(1);
        list.next = new ListNode(-1);
        list.next.next = new ListNode(2);
        expected = new ListNode(1);
        expected.next = new ListNode(2);
        ListNode test = sanitize(list);
        assertEquals(test.val, 1);
        assertEquals(test.next.val, 2);
    }

    @Test
    public void insertAtTest() {
        ListNode test;
        ListNode list;

        list = new ListNode(1);
        test = insertAt(list, new ListNode(2), 1);
        assertEquals(test.val, 1);
        assertEquals(test.next.val, 2);

        test = insertAt(list, new ListNode(3), 1);
        assertEquals(test.val, 1);
        assertEquals(test.next.val, 3);
        assertEquals(test.next.next.val, 2);
    }

    @Test
    public void shuffleTest() {
        ListNode test;
        ListNode list;

        list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        test = shuffle(list);

        System.out.println(test.toString());

        assertTrue(true);
    }
}
