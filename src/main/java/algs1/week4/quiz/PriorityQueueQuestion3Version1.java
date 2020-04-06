package algs1.week4.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import edu.princeton.cs.algs4.MaxPQ;
// import edu.princeton.cs.algs4.MinPQ;

// Find all taxicab numbers less than n; in n^2 log n time complexity and n^2 space complexity.
public class PriorityQueueQuestion3Version1 {
    public static int[] solve(int n) {
        int[] sums = new int[(int) Math.pow(n, 2)];
        List<Integer> ans = new ArrayList<>();
        int k = -1;

        // n2
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                sums[++k] = (int) Math.pow(i, 3) + (int) Math.pow(j, 3);
            }
        }

        System.out.println(Arrays.toString(sums));

        // n
        for (int i = 0; i < (int) Math.pow(n, 2); i++) {
            if (sums[i] == 0) break;
        }

        return new int[] {1};
    }

    public static boolean isTaxicab(int a, int b, int c, int d) {
        return (Math.pow(a, 3) + Math.pow(b, 3)) == (Math.pow(c, 3) + Math.pow(d, 3));
    }

    public static void main(String[] args) {
        int[] twelve = PriorityQueueQuestion3Version1.solve(12);

        // System.out.println(Arrays.toString(twelve));
    }
}
