public class Main{	public static void main(String[] args) throws IOException {

		n = in.nextInt();
		m = in.nextInt();
		adj = new boolean[n][n];
		memo = new long[n][1 << n];
		for (int i = 0; i < m; i++) {
			int u = in.nextInt() - 1;
			int v = in.nextInt() - 1;
			adj[u][v] = adj[v][u] = true;
		}
		for (long arr[] : memo) {
			Arrays.fill(arr, -1);
		}
		Num_Cycle = 0L;
		for (int i = 0; i < n; i++) {
			from = i;
			Num_Cycle += dp(from, (1 << i));
		}
		out.println(Num_Cycle / 2);

		out.flush();
		out.close();
	}
}