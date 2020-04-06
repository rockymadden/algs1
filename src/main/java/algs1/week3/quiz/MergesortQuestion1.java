package algs1.week3.quiz;

public class MergesortQuestion1 {
    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;

        int mid = lo + (hi - lo) / 2;

        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        int fst = 0;
        int snd = mid + 1;
        Comparable[] aux = new Comparable[mid - lo + 1];

        for (int k = lo, l = 0; k <= mid; k++, l++) {
            aux[l] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if      (lo + fst > mid)         a[k] = a[snd++];
            else if (snd > hi)               a[k] = aux[fst++];
            else if (less(a[snd], aux[fst])) a[k] = a[snd++];
            else                             a[k] = aux[fst++];
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}
