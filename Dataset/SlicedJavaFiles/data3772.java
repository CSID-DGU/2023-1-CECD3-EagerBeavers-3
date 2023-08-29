public class Main{	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 505; i++) {
			for (int j = 0; j < 505; j++) {
				for (int k = 0; k < 15; k++) {
					dp[i][j][k] = -1;
				}
			}
		}
		n = in.iscan(); m = in.iscan(); k =in.iscan();
		horW = new int[n+1][m]; verW = new int[n][m+1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m-1; j++) {
				horW[i][j] = in.iscan();
			}
		}
		for (int i = 1; i <= n-1; i++) {
			for (int j = 1; j <= m; j++) {
				verW[i][j] = in.iscan();
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (k % 2 == 1) {
					out.print(-1 + " ");
					continue;
				}
				out.print(dfs(i, j, k/2) * 2 + " ");
			}
			out.println();
		}
		out.close();
	} 
}