public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		N = sc.nextInt();
		adjMat = new boolean[N][N];
		
		bits = new ArrayList[1 << N];
		for(int i = 0; i < 1 << N; ++i)
		{
			bits[i] = new ArrayList<>(1);
			for(int j = 0; j < N; ++j)
				if((i & 1 << j) == 0)
					bits[i].add(j);
		}
		int M = sc.nextInt();
		while(M-->0)
		{
			int u = sc.nextInt() - 1, v = sc.nextInt() - 1;
			adjMat[u][v] = adjMat[v][u] = true;
		}
		long ans = 0;
		for(int i = N; i > 1; --i)
		{
			memo = new long[i][1 << i];
			for(long[] x: memo)
				Arrays.fill(x, -1);
			ans += dp(endNode = i - 1, 1 << endNode);
		}
		for(int i = 0; i < N; ++i)
			for(int j = i + 1; j < N; ++j)
				if(adjMat[i][j])
					--ans;
		out.println(ans >> 1);
		out.flush();
		out.close();
	}
}