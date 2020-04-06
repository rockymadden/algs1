package algs1.week2.quiz;

import edu.princeton.cs.algs4.Stack;

// Queue with two stacks. Implement a queue with two stacks so that each queue operations takes
// a constant amortized number of stack operations.

public class QueuesQuestion1<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueuesQuestion1() {
        this.stack1 = new Stack<T>();
        this.stack2 = new Stack<T>();
    }

    // O(1)
    public void enqueue(T item) {
        this.stack1.push(item);
    }

    // O(2)
    public T dequeue() {
        while (!this.stack1.isEmpty()) {
            this.stack2.push(this.stack1.pop());
        }

        return this.stack2.pop();
    };

    public boolean isEmpty() {
        return this.stack1.isEmpty() && this.stack2.isEmpty();
    };
}
