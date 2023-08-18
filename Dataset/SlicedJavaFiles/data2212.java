public class Main{	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		double r = sc.nextInt();
		double[] xcoords = new double[n];
		double[] ycoords = new double[n];
		Arrays.fill(ycoords, Integer.MIN_VALUE);
		ycoords[0] = r;
		for(int i = 0; i < n; i++) {
			xcoords[i] = sc.nextDouble();
		}
		System.out.print(r + " ");
		for(int i = 1; i < n; ++i) {
			for(int j = 0; j < i; j++) {
				ycoords[i] = Math.max(ycoord(xcoords[j], ycoords[j],xcoords[i],r),ycoords[i]);
			}
			System.out.print(ycoords[i] + " ");
		}
		out.flush();
	}
}