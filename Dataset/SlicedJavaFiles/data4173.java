public class Main{	public static void main(String[] args) throws IOException {
		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		out = new PrintWriter(System.out);
		
		n = nextInt();
		t = 1 << n;
		m = new double[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				m[i][j] = nextDouble();
		
		memo = new double[t];
		Arrays.fill(memo, Double.POSITIVE_INFINITY);
		for (int i = 0; i < n; i++) out.print(String.format(Locale.US, "%.6f", solve(1 << i)) + " ");
		out.println();
		
		out.flush();
	}
}