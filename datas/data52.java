public class Main{	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		adj = new ArrayList[n];
		for (int i = 0; i < adj.length; ++i) {
			adj[i] = new ArrayList<>();
		}
		for (int i = 1; i < n; ++i) {
			int p = sc.nextInt()-1;
			adj[p].add(i);
			adj[i].add(p);
		}
		num = new int[n+1];
		dfs(0, -1);
		for (int i = 1; i < num.length; ++i) {
			num[i] += num[i-1];
		}
		int cur = 1;
		for (int i = 0; i < num.length; ++i) {
			while(cur <= num[i]){
				out.print(i + " ");
				++cur;
			}	
		}
		out.close();
	}
}