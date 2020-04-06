package algs1.week2.quiz;

import edu.princeton.cs.algs4.Shell;

// Permutation. Given two integer arrays of size n, design a subquadratic algorithm to determine
// whether one is a permutation of the other. That is, do they contain exactly the same entries
// but, possibly, in a different order.

public class SortsQuestion2Redo {
    public static boolean permutation(Integer[] a, Integer[] b) {
        Shell.sort(a);
        Shell.sort(b);

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }
}
