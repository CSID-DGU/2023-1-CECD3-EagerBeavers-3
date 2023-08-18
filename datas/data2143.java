public class Main{	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int n = in.nextInt();
		double r = in.nextInt();
		double[] x = new double[n+1];
		double[] y = new double[n+1];
		for (int i = 1; i <= n; i++) {
			x[i] = in.nextInt();
		}
		
		int[] lastx = new int[1001];
		for (int i = 1; i <= n; i++) {
			double s = x[i] - r, e = x[i] + r;
			for (int j = (int)Math.max(0, s); j <= (int)Math.min(1000, e); j++) {
				if (lastx[j] == 0) {
					y[i] = Math.max(y[i], findY(x[i], x[i], 0 - r, 2 * r));
				}
				else {
					y[i] = Math.max(y[i], findY(x[lastx[j]], x[i], y[lastx[j]], 2 * r));
				}
				lastx[j] = i;
			}
		}
		
		for (int i = 1; i <= n; i++) {
			out.println(y[i]);
		}
		out.close();
	}
}