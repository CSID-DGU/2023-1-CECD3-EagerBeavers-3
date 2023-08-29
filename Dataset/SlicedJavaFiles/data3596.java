public class Main{	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner("input.txt");
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
//		Scanner sc = new Scanner(System.in);
//		PrintWriter out = new PrintWriter(System.out);

		int N = sc.nextInt(), M = sc.nextInt();
		int[][] dist = new int[N][M];
		Queue<Integer> q = new LinkedList<>();
		int K = sc.nextInt();
		while(K-->0)
		{
			int x = sc.nextInt() - 1, y = sc.nextInt() - 1;
			q.add(x * M + y);
			dist[x][y] = 1;
		}
		
		int max = 0, ansX = -1, ansY = -1;
		while(!q.isEmpty())
		{
			int u = q.remove(), x = u / M, y = u % M;
			if(dist[x][y] > max) 
				max = dist[ansX = x][ansY = y];
			for(int k = 0; k < 4; ++k)
			{
				int nx = x + dx[k], ny = y + dy[k];
				if(nx >= 0 && ny >= 0 && nx < N && ny < M && dist[nx][ny] == 0)
				{
					dist[nx][ny] = dist[x][y] + 1;
					q.add(nx * M + ny);
				}
				
			}
		}
		out.printf("%d %d\n", ansX + 1, ansY + 1);
		out.close();
	}
}