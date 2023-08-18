public class Main{	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		long[][] dp = new long[N][N];
		dp[0][0] = 1L;
		for(int i = 0; i < N-1; i++) {
			char oper = sc.next().charAt(0);
			if(oper == 'f') {
				dp[i+1][0] = 0L;
				for(int j = 1; j < N; j++) {
					dp[i+1][j] = dp[i][j-1];
				}
			}
			else {
				dp[i+1][N-1] = dp[i][N-1];
				for(int j = N-2; j >= 0; j--) {
					dp[i+1][j] = (dp[i+1][j+1] + dp[i][j]) % MOD;
				}
			}
		}
		long res = 0;
		for(int i = 0; i < N; i++) {
			res += dp[N-1][i];
			res %= MOD;
		}
		out.println(res);
		out.flush();
	}
}