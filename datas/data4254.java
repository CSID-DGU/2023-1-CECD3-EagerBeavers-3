public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			memo = new int[1 << n][m];
			for (int[] x : memo)
				Arrays.fill(x, -1);
			a = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();
			out.println(dp(0, 0));
		}
		out.close();

	}
}