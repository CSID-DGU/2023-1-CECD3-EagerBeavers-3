public class Main{ public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	int n  =sc.nextInt();
	adj=new ArrayList[n+1];
	dist = new int[n+1];
	visitParent = new boolean[n+1];
	for(int i=0;i<=n;i++) adj[i]=new ArrayList<Integer>();
	int max=0;
	//first contribution
	for(int i=1;i<n;i++){
		int u = sc.nextInt(),v=sc.nextInt();
		adj[u].add(v);
		adj[v].add(u);
	}
	dist[1]=0;
	dfs(1,1);
 System.out.println(ans);
 
 
 }
}