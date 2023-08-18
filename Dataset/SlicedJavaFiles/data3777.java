public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[][] costRight = new int[n][m - 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m - 1; j++) {
				costRight[i][j] = sc.nextInt();
			}
		}
		int[][] costDown = new int[n - 1][m];
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < m; j++) {
				costDown[i][j] = sc.nextInt();
			}
		}
		if (k % 2 == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					pw.print(-1 + " ");
				}
				pw.println();
			}
			pw.close();
			return;
		}
		int[][][] dp = new int[k + 1][n][m];
		for (int w = 2; w <= k; w += 2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					dp[w][i][j] = (int) 1e9;
					if (i + 1 < n)
						dp[w][i][j] = Math.min(dp[w][i][j], 2 * costDown[i][j] + dp[w - 2][i + 1][j]);
					if (i - 1 >= 0)
						dp[w][i][j] = Math.min(dp[w][i][j], 2 * costDown[i - 1][j] + dp[w - 2][i - 1][j]);
					if (j + 1 < m)
						dp[w][i][j] = Math.min(dp[w][i][j], 2 * costRight[i][j] + dp[w - 2][i][j + 1]);
					if (j - 1 >= 0)
						dp[w][i][j] = Math.min(dp[w][i][j], 2 * costRight[i][j - 1] + dp[w - 2][i][j - 1]);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				pw.print(dp[k][i][j] + " ");
			}
			pw.println();
		}
		pw.close();
	}
}