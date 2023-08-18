public class Main{	public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
 
		N = sc.nextInt();
		
		a = new double[N][N];
		for(int i = 0; i < N; ++i)
			for(int j = 0; j < N; ++j)
				a[i][j] = sc.nextDouble();
		memo = new double[1<<N];
		f();

		Arrays.fill(memo, -10);		
		for(int i = 0; i < N - 1; ++i)
			out.printf("%.8f ", dp(1 << i));
		out.printf("%.8f\n", dp(1 << N - 1));
 
		out.flush();
		out.close();
	}
}