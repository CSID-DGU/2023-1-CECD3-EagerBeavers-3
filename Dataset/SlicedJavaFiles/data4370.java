public class Main{	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		int m;
		n = NextInt();
		m = NextInt();
		am = new boolean[n][n];
		dp = new long[n][1 << n];
		for (int i = 0; i < n; ++i)
			Arrays.fill(dp[i], -1);
		for (int i = 0; i < m; ++i) {
			int a = NextInt() - 1;
			int b = NextInt() - 1;
			am[a][b] = am[b][a] = true;
		};
		long res = 0;
		for (int a = 0; a < n; ++a)
			res += solve(a, (1 << a));
		System.out.println(res / 2);
	}
}