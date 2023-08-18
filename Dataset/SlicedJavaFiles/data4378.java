public class Main{	public static void main(String[] args)throws Throwable {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		adj=new boolean [n][n];
		for(int i=0;i<m;i++){
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			adj[u][v]=true;
			adj[v][u]=true;
		}
		mem=new long [n+1][(1<<n)];
		for(int i=0;i<=n;i++)
			Arrays.fill(mem[i], -1);
		long ans=0;
		for(int i=0;i<n;i++){
			start=i;
			ans+=dp(i, (1<<i));
		}
		System.out.println(ans/2);
	}
}