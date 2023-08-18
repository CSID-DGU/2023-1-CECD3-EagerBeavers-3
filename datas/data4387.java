public class Main{    public static void main(String[] args) throws Exception
    {
	Scanner bf = new Scanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int n = bf.nextInt(), m = bf.nextInt();
	ArrayList<Integer> [] adjList = new ArrayList[n];
	for (int i = 0; i < adjList.length; i++)
	{
	    adjList[i] = new ArrayList<Integer>();
	}
	for (int i = 0; i < m; i++)
	{
	    int u = bf.nextInt()-1, v = bf.nextInt()-1;
	    adjList[u].add(v);
	    adjList[v].add(u);
	}
	long [][] memo = new long[(1<<n)][n];
	for (int i = 0; i < n; i++)
	{
	    memo[1<<i][i] = 1;
	}
	long ans = 0;
	for (int i = 1; i < 1<<n; i++)
	{
	    if(Integer.bitCount(i) == 1) continue;
	    for (int j = 0; j < n; j++)
	    {
		if((i & (1<<j)) == 0 || j == first(i)) continue;
		for(int v:adjList[j])
		    memo[i][j] += memo[i^(1<<j)][v];
	    }
	}
	for (int i = 1; i < 1<<n; i++)
	{
	    if(Integer.bitCount(i) < 3) continue;
	    int t = first(i);
	    for (int j = 0; j < n; j++)
	    {
		if(adjList[j].contains(t))
		    ans += memo[i][j];
	    }
	}
	out.println(ans/2);
	out.flush();
	out.close();
    }
}