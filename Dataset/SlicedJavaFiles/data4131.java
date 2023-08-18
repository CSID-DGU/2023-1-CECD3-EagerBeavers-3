public class Main{	public static void main(String[] args) throws IOException	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		State curr = new State(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		n = Integer.parseInt(br.readLine());
		State[] list = new State[n];
		for(int i = 0; i < n; i++)	{
			st = new StringTokenizer(br.readLine());
			list[i] = new State(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		dist = new int[n][n];
		home = new int[n];
		for(int i = 0; i < n; i++)	{
			home[i] = dist(curr, list[i]);
		}
		for(int i = 0; i < n; i++)	{
			dist[i][i] = 2 * home[i];
			for(int j = i+1; j < n; j++)		{
				dist[i][j] = dist(list[i], list[j]) + home[i] + home[j];
			}
		}
		best = new int[1 << (n)];
		Arrays.fill(best, -1);
		best[0] = 0;
		System.out.println(solve(-1 + (1<<n)));
		ret = new LinkedList<Integer>();
		resolve(-1 + (1<<n));
		for(int x: ret)
			System.out.print(x + " ");
	}
}