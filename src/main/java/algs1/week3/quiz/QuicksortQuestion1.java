package algs1.week3.quiz;

import java.util.Arrays;
import edu.princeton.cs.algs4.QuickX;

public class QuicksortQuestion1 {
    public static int[][] match(Integer[] nuts, Integer[] bolts) {
        QuickX.sort(nuts);
        QuickX.sort(bolts);

        int n = nuts.length;
        int[][] ans = new int[n][2];

        for (int i = 0; i < n; i++) {
            ans[i][0] = nuts[i];
            ans[i][1] = bolts[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Integer[] nuts = {4, 3, 2, 1};
        Integer[] bolts = {1, 2, 3, 4};

        int[][] ans = match(nuts, bolts);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
