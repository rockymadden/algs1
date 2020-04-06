package algs1.week2.quiz;

// Stack with max. Create a data structure that efficiently supports the stack operations
// (push and pop) and also a return-the-maximum operation. Assume the elements are real
// numbers so that you can compare them.

public class QueuesQuestion2 {
    private Node first;
    private Node maximum;

    private class Node {
        int item;
        Node next;
    }

    public QueuesQuestion2() {
        first = null;
    }

    public void push(int item) {
        Node oldFirst = first;
        Node oldMaximum = maximum;

        first = new Node();
        first.item = item;
        first.next = oldFirst;

        maximum = new Node();
        maximum.item = Math.max(item, oldMaximum  == null ? Integer.MIN_VALUE : oldMaximum.item);
        maximum.next = oldMaximum;
    }

    public int pop() {
        int item = first.item;
        first = first.next;
        maximum = maximum.next;

        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int max() {
        return maximum == null ? Integer.MIN_VALUE : maximum.item;
    }
}
