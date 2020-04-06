package algs1.week4.quiz;

import edu.princeton.cs.algs4.StdRandom;

public class PriorityQueueQuestion2<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;
    private int R;

    public PriorityQueueQuestion2(int capacity) {
        pq = (Key[]) new Comparable[capacity + 1];
        N = 0;
        R = -1;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(Key x) {
        pq[++N] = x;
        swim(N);
    }

    public Key delMax() {
        Key max = pq[1];
        exch(1, N--);
        sink(1);
        pq[N+1] = null;
        return max;
    }

    public Key max() {
        return pq[1];
    }

    public int size() {
        return N;
    }

    public Key sample() {
        if (R == -1) R = StdRandom.uniform(1, N + 1);
        return pq[R];
    }

    public Key delRandom() {
        if (R == -1) R = StdRandom.uniform(1, N + 1);
        Key random = pq[R];
        exch(R, N--);
        sink(R);
        pq[N+1] = null;
        R = -1;
        return random;
    }

    private boolean less(int v, int w) {
        return pq[v].compareTo(pq[w]) < 0;
    }

    private void exch(int i, int j) {
        Key tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;
    }

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k, k/2);
            k = k/2;
        }
    }

    private void sink(int k) {
        while (2*k <= N) {
            int j = 2*k;
            if (j < N && less(j, j+1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    public static void main(String[] args) {
        PriorityQueueQuestion2<Integer> pq = new PriorityQueueQuestion2<>(4);
        pq.insert(1);
        pq.insert(2);
        pq.insert(4);
        pq.insert(8);
        System.out.println("sample: " + pq.sample());
        System.out.println("sample: " + pq.sample());
        System.out.println("delRandom: " + pq.delRandom());
        System.out.println("sample: " + pq.sample());
        System.out.println("delRandom: " + pq.delRandom());
        System.out.println("sample: " + pq.sample());
        System.out.println("delRandom: " + pq.delRandom());
        System.out.println("sample: " + pq.sample());
        System.out.println("delRandom: " + pq.delRandom());
    }
}
