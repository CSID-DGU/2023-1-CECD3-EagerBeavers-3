public class Main{	public static void main(String args[]) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		//BEGIN HERE
		int n = in.nextInt();
		int r = in.nextInt();
		int xs[] = new int[n];
		for(int i = 0; i < n; i++) xs[i] = in.nextInt();
		double ys[] = new double[n];
		ys[0] = r;
		for(int i = 1; i < n; i++) {
			double worst = r;
			for(int j = 0; j < i; j++) {
				if(xs[i] == xs[j]) {
					worst = Math.max(worst, ys[j] + r + r);
				}else if((xs[i] - xs[j]) * (xs[i] - xs[j]) <= 4*r*r ) {

					double hypot = r + r;
					double adj = Math.abs((xs[i] - xs[j]));
					double theta = Math.acos(adj/hypot);
					worst = Math.max(hypot * Math.sin(theta) + ys[j], worst);
				}
			}
			ys[i] = worst;
		}
		for(int i = 0; i < n; i++)
			out.printf("%.10f ",ys[i]);
		out.close();
	}
}