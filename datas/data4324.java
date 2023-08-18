public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] data = s.readLine().split(" ");
		int n = Integer.valueOf(data[0]);
		N = n;
		int m = Integer.valueOf(data[1]);
		graph = new boolean[n][n];
		for (int i = 0 ; i < m ; i++) {
			String[] line = s.readLine().split(" ");
			int a = Integer.valueOf(line[0])-1;
			int b = Integer.valueOf(line[1])-1;
			graph[a][b] = true;
			graph[b][a] = true;
		}
		
		long ans = 0;
		for (int i = 0 ; i < n ; i++) {
			ans += doit(i);
		}
		ans /= 2;
		
		out.println(ans);
		out.flush();
	}
}