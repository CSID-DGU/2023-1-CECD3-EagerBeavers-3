public class Main{	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		int xs = NextInt();
		int ys = NextInt();
		int n = NextInt();
	
		int x[] = new int[n];
		int y[] = new int[n];
		int single[] = new int[n];
		int pair[][] = new int[n][n];
		for (int i = 0; i < n; ++i) {
			x[i] = NextInt();
			y[i] = NextInt();
		}
		for (int i = 0; i < n; ++i) 
			single[i] = 2 * dist(xs, ys, x[i], y[i]);
		for (int i = 0; i < n; ++i)
			for (int j = 0; j < n; ++j)
				pair[i][j] = dist(xs, ys, x[i], y[i]) + 
							 dist(x[i], y[i], x[j], y[j]) +
							 dist(x[j], y[j], xs, ys);
		int dp[] = new int[1 << n];
		int prev[] = new int[1 << n];
		for (int mask = 0; mask < (1 << n); ++mask) {
			int p = -1;
			for (int i = 0; i < n; ++i)
				if (((mask >> i) & 1) != 0) {
					p = i;
					break;
				}
			if (p == -1) continue;
			dp[mask] = dp[mask ^ (1 << p)] + single[p];
			prev[mask] = p;
			for (int j = p + 1; j < n; ++j) {
				if (((mask >> j) & 1) != 0) {
					int res = pair[p][j] + dp[mask ^ (1 << p) ^ (1 << j)];
					if (res < dp[mask]) {
						dp[mask] = res;
						prev[mask] = p + 100 * j;
					}
				}
			}
		}
		int cur = (1 << n) - 1;
		System.out.printf("%d\n0 ", dp[cur]);
		while(cur != 0) {
			if (prev[cur] < 100) {
				System.out.printf("%d %d ", prev[cur] + 1, 0);
				cur ^= (1 << prev[cur]);
			} else {
				int i = prev[cur] / 100;
				int j = prev[cur] % 100;
				System.out.printf("%d %d %d ", i + 1, j + 1, 0);
				cur = cur ^ (1 << i) ^ (1 << j);
			}
		}
	}
}