public class Main{	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[][] lr = new int[n][m-1];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m-1; j++){
				lr[i][j] = sc.nextInt();
			}
		}
		int[][] ud = new int[n-1][m];
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < m; j++){
				ud[i][j] = sc.nextInt();
			}
		}
		if(k % 2 == 1) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					sb.append(-1+" ");
				}
				sb.replace(sb.length()-1, sb.length(), "\n");
			}
			PrintWriter pw = new PrintWriter(System.out);
			pw.println(sb.toString().trim());
			pw.flush();
		}
		else {
			int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
			long[][][] dp = new long[k/2+1][n][m];
			for(int s = 1; s <= k/2; s++) {
				for(int i = 0; i < n; i++){
					for(int j = 0; j < m; j++){
						dp[s][i][j] = Long.MAX_VALUE;
						for(int[] d: dir) {
							int u = i + d[0], v = j + d[1];
							if(u >= 0 && u < n && v >= 0 && v < m) {
								long w = calc(i, j, u, v, lr, ud);
								dp[s][i][j] = Math.min(dp[s][i][j], dp[s-1][u][v] + 2*w);
							}
						}
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					sb.append(dp[k/2][i][j]+" ");
				}
				sb.replace(sb.length()-1, sb.length(), "\n");
			}
			PrintWriter pw = new PrintWriter(System.out);
			pw.println(sb.toString().trim());
			pw.flush();
		}
	}
}