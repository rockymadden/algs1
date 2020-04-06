package algs1.week2;

import edu.princeton.cs.algs4.StdRandom;

public class Quick {
    public static <T extends Comparable<T>> void sort(T[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {
        if (hi <= lo) return;

        int j = partition(a, lo, hi);

        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    private static <T extends Comparable<T>> void exch(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // [3, 4, 4, 5, 1]
    // [3, 1, 4, 5, 4]
    // [1, 3, 4, 5, 4]
    // ---
    // [4, 5, 4]
    // [4, 4, 5]
    private static <T extends Comparable<T>> int partition(T[] a, int lo, int hi) {
        int i = lo; // We don't use lo - 1, I beleve, because we are using a[lo] for the partition
                    // and don't want to examine it. Our ++i ensures we go past it on the first
                    // iteration.
        int j = hi + 1; // Go past hi so that our code below stays consistent with --j.
        T v = a[lo];

        // Super nice! Constantly loop until we are done ensuring that on the left we have items
        // that are less than v AND on the right we have items that are more than v.
        //
        // Have the left pointer move right until it finds an item that is bigger -- because we only
        // want items smaller on that side of the partition.
        // Have the right pointer move left until it finds an item that is smaller -- because we
        // only want items larger on that side of the partition.
        //
        // When you have found those, exchange them!
        //
        // If i meets the right edge, hi, stop.
        // If j meets the left edge, lo, stop.
        // If i and j are inverted or the same, don't excahnge.
        while (true) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;

            if (i >= j) break;

            exch(a, i, j);
        }

        exch(a, lo, j); // Exchange ~v with the point in which j stopped which should be the point
                        // right before everything is greater than ~v. If all are less than, it
                        // exchanges itself.

        return j; // Return the new index where ~v lives.
    }
}
