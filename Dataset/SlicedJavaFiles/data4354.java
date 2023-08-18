public class Main{public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	n = input.nextInt();
	m = input.nextInt();
	g = new boolean[n][n];
	for(int i = 0; i<m; i++)
	{
		int a = input.nextInt()-1, b = input.nextInt()-1;
		g[a][b] = g[b][a] = true;
	}
	long res = 0;
	map = new HashMap<Integer, Long>();
	for(int i = n-1; i>=0; i--)
	{
		memo = new long[i+1][1<<(i+1)];
		for(long[] A : memo) Arrays.fill(A, -1);
		res += count(i, i, 1<<i)/2;
	}
	out.println(res);
	out.close();
}
}