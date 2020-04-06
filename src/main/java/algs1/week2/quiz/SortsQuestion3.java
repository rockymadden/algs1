package algs1.week2.quiz;

// Dutch national flag. Given an array of n buckets, each containing a red, white, or blue pebble,
// sort them by color. The allowed operations are:
//
// * swap(i,j): swap the pebble in bucket i with the pebble in bucket j.
// * color(i): determine the color of the pebble in bucket i.
//
// The performance requirements are as follows:
//
// * At most n calls to color().
// * At most n calls to swap().
// * Constant extra space.
//
public class SortsQuestion3 {
    // 0 == red, 1 == white, 2 == blue.
    public static int color(int[] i) {
        return i[0];
    }

    public static void swap(int[] i, int[] j) {
        int tmp = i[0];
        i[0] = j[0];
        j[0] = tmp;
    };

    public static int[][] sort(int[][] buckets) {
        

        return buckets;
    }
}
