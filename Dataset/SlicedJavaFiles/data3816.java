public class Main{    public static void main(String[] args) throws IOException {
        int n = rni(), m = ni(), k = ni(), ans[][] = new int[n][m];
        WGraph g = wgraph(n * m);
        for (int i = 0; i < n; ++i) {
            r();
            for (int j = 0; j < m - 1; ++j) {
                g.c(i * m + j, i * m + j + 1, ni());
            }
        }
        for (int i = 0; i < n - 1; ++i) {
            r();
            for (int j = 0; j < m; ++j) {
                g.c(i * m + j, (i + 1) * m + j, ni());
            }
        }
        if (k % 2 == 1) {
            for (int[] row : ans) {
                fill(row, -1);
                prln(row);
            }
            close();
            return;
        }
        k >>= 1;
        for (int l = 0; l < k; ++l) {
            int nans[][] = new int[n][m];
            for (int[] row : nans) {
                fill(row, IBIG);
            }
            for (int i = 0; i < n * m; ++i) {
                for (int ed[] : g.get(i)) {
                    int j = ed[0], d = ed[1];
                    if (ans[i / m][i % m] + d < nans[j / m][j % m]) {
                        nans[j / m][j % m] = ans[i / m][i % m] + d;
                    }
                }
            }
            ans = nans;
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                ans[i][j] *= 2;
            }
        }
        for (int[] row : ans) {
            prln(row);
        }
        close();
    }
}