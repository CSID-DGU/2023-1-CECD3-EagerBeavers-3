public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		map = new HashMap<State, Integer>();
		connect = new boolean[n][n];
		ans = new long[n][1<<n];
		for(int i = 0; i < n; i++)
			Arrays.fill(ans[i], -1);
		int m = Integer.parseInt(st.nextToken());
		while(m-- > 0)	{
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			a--;
			b--;
			connect[a][b] = connect[b][a] = true;
		}
		long ret = 0;
		int mask = 1 << n;
		mask--;
		for(int i = 0; i < n; i++)	{
			for(int out = i+1; out < n; out++)	{
				if(connect[i][out])	{
					ret += solve(mask - (1<<out), out, true);
				}
			}
			mask -= (1<<i);
		}
		System.out.println(ret/2);
	}
}