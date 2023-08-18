public class Main{	public static void main(String[] args) throws IOException	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		ourLevel = Integer.parseInt(st.nextToken());
		State[] list = new State[n];
		for(int i = 0; i < n; i++)	{
			st = new StringTokenizer(br.readLine());
			list[i] = new State(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())/10);
		}
		System.out.println(solve(list, 0, k));
	}
}