public class Main{	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		PrintWriter out = new PrintWriter(System.out);
		V = sc.nextInt();
		adjList = new ArrayList[V];
		for (int i = 0 ; i < V ; ++i) adjList[i] = new ArrayList<>();
		int E = sc.nextInt();
		while (E -- > 0) {
			int v = sc.nextInt() - 1;
			int u = sc.nextInt() - 1;
			adjList[v].add(u);
			adjList[u].add(v);
		}
		out.print(Number_Of_Simple_Cycles());
		out.flush(); 
		out.close();
	}
}