public class Main{    public static void main(String[] args) throws IOException {
        int n = rni(), t = ni(), song[][] = new int[n][2];
        for (int i = 0; i < n; ++i) {
            song[i][0] = rni();
            song[i][1] = ni() - 1;
        }
        int dp[][] = new int[1 << n][4], sum[] = new int[1 << n], ans = 0;
        dp[0][3] = 1;
        for (int i = 0; i < 1 << n; ++i) {
            for (int j = 0; j < 4; ++j) {
                for (int k = 0; k < n; ++k) {
                    if ((i & (1 << k)) == 0 && song[k][1] != j) {
                        dp[i | (1 << k)][song[k][1]] = madd(dp[i | (1 << k)][song[k][1]], dp[i][j]);
                        sum[i | (1 << k)] = sum[i] + song[k][0];
                    }
                }
            }
        }
        for (int i = 0; i < 1 << n; ++i) {
            if (sum[i] == t) {
                ans = madd(ans, dp[i][0], dp[i][1], dp[i][2]);
            }
        }
        prln(ans);
        close();
    }
}