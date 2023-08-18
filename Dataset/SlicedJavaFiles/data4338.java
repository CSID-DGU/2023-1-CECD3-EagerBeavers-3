public class Main{	public static void main(String[] args) throws IOException {
		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		out = new PrintWriter(System.out);

		n = nextInt();
		m = nextInt();
		
		g = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int a = nextInt()-1, b = nextInt()-1;
			g[a][b] = g[b][a] = true;
		}
		
		long ans = 0;
		for (int i = n; i > 0; i--) {
			//long cur = solve(i);
			long cur = calc(g, i-1);
			ans += cur;
		}
		
		out.println(ans/2);
		
		out.flush();
	}
}