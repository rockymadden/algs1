package algs1.week1.quiz;

public class Question1 {
    private int[] id;
    private int[] sz;
    private int unconnected;

    public Question1(int n) {
        id = new int[n];
        sz = new int[n];
        unconnected = n - 1;

        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
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

    public boolean allConnected() {
        return unconnected == 0;
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        
        if (i == j) return;

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
            unconnected--;
        } else {
            id[j] = i;
            sz[i] += sz[j];
            unconnected--;
        }
    }
}