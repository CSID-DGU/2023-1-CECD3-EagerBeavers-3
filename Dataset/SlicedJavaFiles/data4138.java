public class Main{	public static void main(String[] args) throws IOException {
		sc = new StringTokenizer(br.readLine());
		int a = nxtInt();
		int b = nxtInt();
		n = nxtInt() + 1;
		x = new int[n];
		y = new int[n];
		dp = new int[1 << n];
		Arrays.fill(dp, -1);
		x[0] = a;
		y[0] = b;
		for (int i = 1; i < n; i++) {
			x[i] = nxtInt();
			y[i] = nxtInt();
		}
		out.println(solve(1 << 0));
		out.print(0);
		prnt(1 << 0);
		out.println();
		br.close();
		out.close();
	}
}