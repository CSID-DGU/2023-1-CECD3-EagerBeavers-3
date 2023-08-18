public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		Point s = new Point(sc.nextInt(), sc.nextInt());
		n = sc.nextInt();
		Point[] a = new Point[n];
		for(int i = 0; i < n; ++i)
			a[i] = new Point(sc.nextInt(), sc.nextInt());
		dS = new int[n];
		dd = new int[n][n];
		for(int i = 0; i < n; ++i)
		{
			dS[i] = dist2(s, a[i]);
			for(int j = 0; j < n; ++j)
				dd[i][j] = dist2(a[i], a[j]);
		}

		memo = new int[1 << n];
		Arrays.fill(memo, -1);
		out.println(dp(0, 0));
		print(0, 0);
		out.println(sb);
		out.flush();
		out.close();
	}
}