public class Main{    public static void main(String[] args) throws IOException {
        setReader();
        int n = nextInt(), MOD = nextInt();
        long[] pow = new long[n+2];
        pow[0] = 1;
        for (int i=1; i<=n+1; i++) pow[i] = (pow[i-1] * 2) % MOD;
        long[][] C = new long[n+2][n+2];
        for (int i=0; i<=n+1; i++) {
            C[i][0] = 1;
            for (int j=1; j<=i; j++) {
                C[i][j] = (C[i-1][j-1] + C[i-1][j]) % MOD;
            }
        }
        long[][] dp = new long[n+2][n+1];
        dp[0][0] = 1;
        for (int i=0; i<=n; i++) {
            for (int j=0; j<=i; j++) {
                for (int k=1; i + k + 1 <= n + 1; k++) {
                    dp[i + k + 1][j + k]+=(((dp[i][j] * C[j + k][k]) % MOD * pow[k-1]) % MOD);
                    dp[i + k + 1][j + k]%=MOD;
                }
            }
        }
        long res = 0;
        for (int i=0; i<=n; i++) res = (res + dp[n+1][i]) % MOD;
        System.out.println(res);
    }
}