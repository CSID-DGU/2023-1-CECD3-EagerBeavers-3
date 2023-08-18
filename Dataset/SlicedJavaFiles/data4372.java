public class Main{	public static void main(String[] args) {
		st = new StreamTokenizer(new BufferedReader(new InputStreamReader(
				System.in)));

		int n = nextInt();
		int m = nextInt();

		edges = new int[n][n];

		for (int i = 0; i < m; i++) {
			int from = nextInt() - 1;
			int to = nextInt() - 1;
			edges[from][to] = edges[to][from] = 1;
		}

		dp = new long[(1 << n) + 1][n + 1];

		for (int mask = 1; mask < (1 << n); mask++) {
			for (int i = 0; i < n; i++) {
				if (Integer.bitCount(mask) == 1 && (mask & (1 << i)) != 0) {
					dp[mask][i] = 1;
					continue;
				}

				if (Integer.bitCount(mask) > 1 && (mask & (1 << i)) != 0
						&& first(mask, n) != i) {
					for (int j = 0; j < n; j++) {
						if (edges[i][j] == 1) {
							dp[mask][i] += dp[mask ^ (1 << i)][j];
						}
					}
				}
			}
		}

		long count = 0;
		for (int mask = 1; mask < (1 << n); mask++) {
			for (int i = 0; i < n; i++) {
				if (Integer.bitCount(mask) >= 3
						&& edges[i][first(mask, n)] != 0)
					count += dp[mask][i];
			}
		}

		System.out.println(count / 2);

	}
}