package algs1.week2.quiz;

import edu.princeton.cs.algs4.Shell;

// Intersection of two sets. Given two arrays 𝚊[] and 𝚋[], each containing n distinct 2D points
// in the plane, design a subquadratic algorithm to count the number of points that are contained
// both in array 𝚊[] and array 𝚋[].

public class SortsQuestion1Redo {
    public static Integer[] intersect(Integer[] a, Integer[] b) {
        Shell.sort(a);
        Shell.sort(b);

        int matches = 0;
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) i++;
            else if (a[i] > b[j]) j++;
            else {
                matches++;
                i++;
                j++;
            };
        }

        Integer[] ans = new Integer[matches];
        int k = 0;
        i = 0;
        j = 0;

        while (k < ans.length) {
            if (a[i] < b[j]) i++;
            else if (a[i] > b[j]) j++;
            else {
                ans[k++] = a[i];
                i++;
                j++;
            }
        }

        return ans;
    }
}
