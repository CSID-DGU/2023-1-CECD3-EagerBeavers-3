public class Main{    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            mod = sc.nextLong();
            long res = 0;
            initFac(n + 7);
            long [] tpow = new long[n + 7];
            long [][] combo = new long[n + 6][n + 6];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i)
                        combo[i][j] = 1;
                    else
                        combo[i][j] = (combo[i - 1][j - 1] + combo[i - 1][j]) % mod;
                }
            }
            tpow[0] = 1;
            for (int i = 1; i <= n + 6; i++) tpow[i] = (tpow[i - 1] * 2) % mod;
            // dp[i][auto]
            long [][] dp = new long[n + 1][n + 1];
            for (int i = 1; i <= n; i++) dp[i][0] = tpow[i - 1];
            for (int i = 3; i <= n; i++) {
                for (int auto = 1; auto <= n / 2; auto++) {
                    if (!check(i, auto)) continue;
                    long total = 0;
                    for (int j = i - 2; j >= 1; j--) {
                        if (!check(j, auto - 1)) break;
                        int len = i - j - 1;
                        long ways = tpow[len - 1];
                        int picked = j - (auto - 1);
                        long interleave = combo[len + picked][picked];
                        ways = (ways * interleave) % mod;
                        ways = (ways * dp[j][auto - 1]) % mod;
                        total = (total + ways) % mod;
                    }
                    dp[i][auto] = total;
                    if (i == n) res = (res + dp[i][auto]) % mod;
                }
            }
            res = (res + dp[n][0]) % mod;
            out.println(res);
        }
        out.close();
    }
}