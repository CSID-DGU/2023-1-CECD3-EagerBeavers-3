public class Main{	public static void main(String args[]) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		//BEGIN HERE
		int n = in.nextInt();
		seq = new boolean[n];
		for (int i = 0; i  < n; i++ ) {
			seq[i] = (in.next().charAt(0) == 'f');
		}
		memo = new long[n][n+1];
		for(int i = 0; i < n; i++) {
				Arrays.fill(memo[i], -1);
		}
		System.out.println(go(0, 0));
		out.close();
	}
}