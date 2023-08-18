public class Main{    public static void main(String[] args) throws IOException {
        int t = ri();
        while (t --> 0) {
            int n = rni(), m = ni(), a[][] = new int[m][n], dp[] = new int[1 << n];
            for (int i = 0; i < n; ++i) {
                int[] row = ria(m);
                for (int j = 0; j < m; ++j) {
                    a[j][i] = row[j];
                }
            }
            for (int i = 0; i < m; ++i) {
                for (int r = 0; r < 1 << n; ++r) {
                    for (int j = 0; j < n; ++j) {
                        if ((r & (1 << j)) == 0) {
                            continue;
                        }
                        dp[r] = max(dp[r], dp[r ^ (1 << j)] + a[i][j]);
                    }
                }
                for (int r = 0; r < 1 << n; ++r) {
                    int s = r;
                    for (int j = 0; j < n; ++j) {
                        if ((s & 1) != 0) {
                            s = (s >> 1) | (1 << (n - 1));
                        } else {
                            s >>= 1;
                        }
                        dp[s] = max(dp[s], dp[r]);
                    }
                }
            }
            prln(dp[(1 << n) - 1]);
        }
        close();
    }
}