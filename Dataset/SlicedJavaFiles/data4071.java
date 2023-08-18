public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);

		o = new Point(sc.nextInt(), sc.nextInt());
		n = sc.nextInt();
		a = new Point[n];
		for (int i = 0; i < n; i++)
			a[i] = new Point(sc.nextInt(), sc.nextInt());
		
		dp = new int[(1 << n) + 5];
		Arrays.fill(dp, -1);
		out.println(rec(0));
		out.print(0 + " ");
		path(0);
		out.println();
		
		out.flush();
		out.close();
	}
}