public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		n = sc.nextInt();
		memo = new int[n+1][n+1];
		for(int [] i:memo)
			Arrays.fill(i, -1);
		c = new char[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
		}
		out.println(dp(0,0));
		out.flush();
		out.close();
	}
}