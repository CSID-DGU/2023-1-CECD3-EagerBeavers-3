public class Main{	public static void main(String[] args) throws FileNotFoundException {
		InputReader in = new InputReader(System.in);
		// Scanner in = new Scanner(System.in);
		// Scanner in = new Scanner(new BufferedReader(new
		// InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(System.out);
		// InputReader in = new InputReader(new
		// File("ethan_traverses_a_tree.txt"));
		// PrintWriter out = new PrintWriter(new
		// File("ethan_traverses_a_tree-output.txt"));

		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();

		int[][][] cost = new int[n][m][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m - 1; j++) {
				int u = in.nextInt();
				cost[i][j][1] = u;
				cost[i][j + 1][3] = u;
			}
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < m; j++) {
				int u = in.nextInt();
				cost[i][j][0] = u;
				cost[i + 1][j][2] = u;
			}
		}

		if (k % 2 == 0) {
			k = k / 2;
			int[][][] dp = new int[k + 1][n][m];

			for (int i = 0; i <= k; i++) {
				for (int x = 0; x < n; x++) {
					for (int y = 0; y < m; y++) {
						if (i == 0) {
							dp[i][x][y] = 0;
						} else {
							int min = 1000000000;

							for (int way = 0; way < to.length; way++) {
								int nextx = x + to[way][0];
								int nexty = y + to[way][1];

								if (nextx >= 0 && nextx < n && nexty >= 0 && nexty < m) {
									min = Math.min(min, dp[i - 1][nextx][nexty] + cost[x][y][way]);
								}
							}

							dp[i][x][y] = min;
						}
					}
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (j == m - 1) {
						out.printf("%d\n", dp[k][i][j] * 2);
					} else {
						out.printf("%d ", dp[k][i][j] * 2);
					}
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (j == m - 1) {
						out.printf("-1\n");
					} else {
						out.printf("-1 ");
					}
				}
			}
		}

		out.close();
	}
}