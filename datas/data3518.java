public class Main{	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		String[] s2 = br.readLine().split(" ");

		int n = (int) Long.parseLong(s2[0]);
		long m = Long.parseLong(s2[1]);
		dp = new long[n + 2][n + 2];
		long[] power = new long[n + 1];
		mod = m;
		long[][] choose = new long[n + 2][n + 2];
		getPow(power, n + 1);
		getChoose(choose, n + 2, n + 2);
		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				for (int k = 1; k + i <= n; k++) {
				//	System.out.println((j + k) + " " + k + " - " + choose[j + k][k]);
					dp[i + k + 1][j
							+ k] = (dp[i + k + 1][j + k] + (((dp[i][j] * power[k - 1]) % mod) * choose[j + k][k]) % mod)
									% mod;
				}
			}
		}
		long ans = 0;
		for (int i = 0; i <= n; i++) {
			ans = (ans + dp[n + 1][i]) % mod;
		}
		pw.println(ans);
		pw.close();
	}
}