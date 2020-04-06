package algs1.week1.quiz;

public class Question2 {
    private int[] id;
    private int[] sz;
    private int[] lg;

    public Question2(int n) {
        id = new int[n];
        sz = new int[n];
        lg = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
            lg[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
           id[i] = id[id[i]];
           i = id[i];
        }
        
        return i;
    }

    public boolean connected(int p, int q) {
       return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        
        if (i == j) return;

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
            lg[j] = Math.max(lg[i], lg[j]);
            lg[i] = -1;
        } else {
            id[j] = i;
            sz[i] += sz[j];
            lg[i] = Math.max(lg[i], lg[j]);
            lg[j] = -1;
        }
    }

    public int find(int p) {
        int i = root(p);

        return lg[i];
    }
}