package algs1.week2.quiz;

import java.util.HashSet;
import java.util.Set;

// Intersection of two sets. Given two arrays 𝚊[] and 𝚋[], each containing n distinct 2D points
// in the plane, design a subquadratic algorithm to count the number of points that are contained
// both in array 𝚊[] and array 𝚋[].

public class SortsQuestion1 {
    // O(n)
    public static int[] intersect(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        int found = 0;

        // n
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        // n
        for (int i = 0; i < b.length; i++) {
            if (!set.contains(b[i])) {
                b[i] = -1;
            } else {
                found++;
            }
        }

        int[] ans = new int[found];

        // n
        for (int i = 0, j = 0; i < b.length; i++) {
            if (b[i] != -1) {
                ans[j++] = b[i];
            }
        }

        return ans;
    }
}
