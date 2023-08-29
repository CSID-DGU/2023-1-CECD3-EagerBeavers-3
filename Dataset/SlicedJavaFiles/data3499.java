public class Main{    public static void main(String[] args) throws FileNotFoundException {
//        InputReader in = new InputReader(new FileInputStream("input.txt"));
//        PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream("milkvisits.out")));
//
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

//        long start = System.currentTimeMillis();
        int n = in.nextInt();
        long mod = in.nextLong();
        long[] invs = allInvs(n + 3, mod);
        long[] facts = new long[n + 2];
        facts[0] = 1;
        long[] invFacts = new long[n + 2];
        invFacts[0] = 1;
        for (int i = 1; i < n + 2; i++) {
            facts[i] = (facts[i - 1] * i) % mod;
            invFacts[i] = (invFacts[i - 1] * invs[i]) % mod;
        }
        long[] pow2 = new long[n+3];
        pow2[0] = 1;
        for (int i = 1; i < n+3; i++) {
            pow2[i] = pow2[i-1] * 2 % mod;
        }

        long[][] dp = new long[n + 2][n + 2];
        for (int i = 2; i <= n + 1; i++) {
            dp[i][1] = invFacts[i - 1] * pow2[i - 2] % mod;
            for (int k = 2; k <= n; k++) {
                for (int j = i - 2; j >= 1; j--) {
                    dp[i][k] = (dp[i][k] + dp[j][k - 1] * pow2[ i - j - 2] % mod * invFacts[i - j - 1] % mod) % mod;
                }
            }
        }

        long ans = 0;
        for (int k = 1; k <= n; k++) {

            ans = (ans + dp[n + 1][k] * facts[n - k + 1] % mod) % mod;
        }
        out.println(ans);

        out.close();
    }
}