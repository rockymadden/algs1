package algs1.week4.quiz;

import edu.princeton.cs.algs4.MaxPQ;
import edu.princeton.cs.algs4.MinPQ;

public class PriorityQueueQuestion1<Key extends Comparable<Key>> {
    public MaxPQ<Key> left;
    public MinPQ<Key> right;
    public int N;

    public PriorityQueueQuestion1() {
        left = new MaxPQ<>();
        right = new MinPQ<>();
    }

    public void insert(Key v) {
        if (N == 0) {
            left.insert(v);
            N++;
        } else {
            Key tmp = N++ % 2 == 1 ? left.delMax() : right.delMin();
            left.insert(tmp.compareTo(v) <= 0 ? tmp : v);
            right.insert(tmp.compareTo(v) <= 0 ? v : tmp);
        }
    }

    public Key findTheMedian() {
        if (N == 0) { throw new IllegalArgumentException("Expected at least 1 Key."); }

        return left.max();
    }

    public Key removeTheMedian() {
        Key removed;

        if (N == 0) { throw new IllegalArgumentException("Expected at least 1 key."); }
        else if (N == 1) { removed = left.delMax(); }
        else {
            removed = left.delMax();

            if (N % 2 == 0) {
                Key tmp = right.delMin();
                left.insert(tmp);
            }
        }

        N--;

        return removed;
    }

    public static void main(String[] args) {
        PriorityQueueQuestion1<Integer> pq = new PriorityQueueQuestion1<>();

        pq.insert(3);
        System.out.println("findTheMedian: " + pq.findTheMedian());
        pq.insert(5);
        System.out.println("findTheMedian: " + pq.findTheMedian());
        pq.insert(1);
        System.out.println("findTheMedian: " + pq.findTheMedian());
        pq.insert(1);
        System.out.println("findTheMedian: " + pq.findTheMedian());
        pq.insert(2);
        System.out.println("findTheMedian: " + pq.findTheMedian());
        pq.insert(7);
        System.out.println("findTheMedian: " + pq.findTheMedian());
        pq.insert(3);
        System.out.println("findTheMedian: " + pq.findTheMedian());
        pq.insert(2);
        System.out.println("findTheMedian: " + pq.findTheMedian());
        pq.insert(4);
        System.out.println("findTheMedian: " + pq.findTheMedian());

        System.out.println("-----------");

        System.out.println("removeTheMedian: " + pq.removeTheMedian());
        System.out.println("findTheMedian: " + pq.findTheMedian());
        System.out.println("removeTheMedian: " + pq.removeTheMedian());
        System.out.println("findTheMedian: " + pq.findTheMedian());
        System.out.println("removeTheMedian: " + pq.removeTheMedian());
        System.out.println("findTheMedian: " + pq.findTheMedian());
        System.out.println("removeTheMedian: " + pq.removeTheMedian());
        System.out.println("findTheMedian: " + pq.findTheMedian());
        System.out.println("removeTheMedian: " + pq.removeTheMedian());
        System.out.println("findTheMedian: " + pq.findTheMedian());
        System.out.println("removeTheMedian: " + pq.removeTheMedian());
        System.out.println("findTheMedian: " + pq.findTheMedian());
        System.out.println("removeTheMedian: " + pq.removeTheMedian());
        System.out.println("findTheMedian: " + pq.findTheMedian());
        System.out.println("removeTheMedian: " + pq.removeTheMedian());
        System.out.println("findTheMedian: " + pq.findTheMedian());
        System.out.println("removeTheMedian: " + pq.removeTheMedian());
    }
}
