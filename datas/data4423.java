public class Main{    public static void main(String[] args) throws IOException {
        int n = rni(), m = ni(), a[][] = new int[n][];
        for (int i = 0; i < n; ++i) {
            a[i] = ria(m);
        }
        int delta[][] = new int[n][n], end_delta[][] = new int[n][n], dp[][][] = new int[n][1 << n][n];
        for (int i = 0; i < n; ++i) {
            fill(delta[i], IBIG);
            fill(end_delta[i], IBIG);
            delta[i][i] = 0;
        }
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = 0; k < m; ++k) {
                    delta[i][j] = delta[j][i] = min(delta[i][j], abs(a[i][k] - a[j][k]));
                }
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 1; k < m; ++k) {
                    end_delta[i][j] = min(end_delta[i][j], abs(a[j][k] - a[i][k - 1]));
                }
            }
        }
        for (int[][] layer : dp) {
            for (int[] row : layer) {
                fill(row, IBIG);
            }
        }
        for (int i = 1; i < 1 << n; ++i) {
            boolean one_bit = Integer.bitCount(i) == 1;
            for (int j = 0; j < n; ++j) {
                if ((i & (1 << j)) > 0) {
                    for (int l = 0; l < n; ++l) {
                        if ((i & (1 << l)) == 0) {
                            int max = 0;
                            for (int k = 0; k < n; ++k) {
                                if ((one_bit || j != k) && (i & (1 << k)) > 0) {
                                    max = max(max, min(dp[j][i][k], delta[k][l]));
                                }
                            }
                            // pr(j + " ");
                            // pr(Integer.toBinaryString(i) + " ");
                            // prln(l, max);
                            dp[j][i | (1 << l)][l] = max;
                        }
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i != j) {
                    // prln(i, j, dp[i][(1 << n) - 1][j]);
                    ans = max(ans, min(dp[i][(1 << n) - 1][j], end_delta[j][i]));
                }
            }
        }
        if (n == 1) {
            ans = maxof(end_delta[0]);
        }
        prln(ans);
        close();
    }
}