package algs1.week2.quiz;

import java.util.HashMap;
import java.util.Map;

// Permutation. Given two integer arrays of size n, design a subquadratic algorithm to determine
// whether one is a permutation of the other. That is, do they contain exactly the same entries
// but, possibly, in a different order.

public class SortsQuestion2 {
    // O(n)
    public static boolean permutation(int[] a, int[] b) {
        Map<Integer, Integer> map = new HashMap<>();

        // n
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        // n
        for (int i = 0; i < b.length; i++) {
            if (map.containsKey(b[i])) {
                map.put(b[i], map.get(b[i]) - 1);
            } else {
                return false;
            }
        }

        // n
        for (Integer v : map.values()) {
            if (v != 0) {
                return false;
            }
        }

        return true;
    }
}
