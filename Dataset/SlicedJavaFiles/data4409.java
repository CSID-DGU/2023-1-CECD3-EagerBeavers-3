public class Main{	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		n = in.nextInt();
		m = in.nextInt();
		arr = new int[n][m];
		costs = new int[n][n];
		wrapCosts = new int[n][n];
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++) {
				arr[r][c] = in.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				costs[i][j] = Integer.MAX_VALUE;
				for (int c = 0; c < m; c++) {
					costs[i][j] = Math.min(costs[i][j], Math.abs(arr[i][c] - arr[j][c]));
				}
				costs[j][i] = costs[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				wrapCosts[i][j] = Integer.MAX_VALUE;
				for (int c = 0; c < m - 1; c++) {
					wrapCosts[i][j] = Math.min(wrapCosts[i][j], Math.abs(arr[i][c + 1] - arr[j][c]));
				}
			}
		}
		memo = new int[n][1 << n];
		long best = 0;
		for (start = 0; start < n; start++) {
			for (int[] a : memo) Arrays.fill(a, -1);
			best = Math.max(best, go(start, (1 << n) - 1 - (1 << start)));
		}
		out.println(best);
		out.close();
	}
}