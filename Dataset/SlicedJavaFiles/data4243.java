public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			indices = new Integer[m];

			memo = new int[1 << n][m];
			for (int[] x : memo)
				Arrays.fill(x, -1);
			a = new int[n][m];
			int[] max = new int[m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					a[i][j] = sc.nextInt();
					max[j] = Math.max(max[j], a[i][j]);
				}
			for (int j = 0; j < m; j++) {
				indices[j] = j;
			}
			Arrays.sort(indices, Comparator.comparingInt(i -> -max[i]));
			out.println(dp(0, 0));
		}
		out.close();

	}
}