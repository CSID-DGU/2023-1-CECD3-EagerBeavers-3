public class Main{	public static void main(String[] args) {
		InputReader r = new InputReader(System.in);
		
		N = r.nextInt();
		M = r.nextInt();
		
		g = new int[N][N];
		
		C = new long[N + 1];
		
		DP = new long[1 << N][N];
		
		for(int k = 0; k < M; k++){
			int i = r.nextInt() - 1;
			int j = r.nextInt() - 1;
			
			g[i][j] = g[j][i] = 1;
		}
		
		for(long[] i : DP)
			Arrays.fill(i, -1);
		
		long ret = 0;
		for(int s = 0; s < N; s++){
			ret += go(s, 1 << s, s);
		}
		
		System.out.println(ret / 2);
	}
}