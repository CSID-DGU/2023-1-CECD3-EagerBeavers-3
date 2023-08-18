public class Main{	public static void main(String[] args){
		FastScanner scan = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = scan.nextInt(), r = scan.nextInt();
		int[] x = scan.nextIntArray(n);
		double[] y = new double[n];
		for(int i = 0; i < n; i++) {
			double best = 0;
			for(int j = 0; j < i; j++) {
				if(Math.abs(dist(x[i], y[j], x[j], y[j])-2*r) <= 1e-7) {
					best = Math.max(best, y[j]);
					continue;
				}
				double lo = y[j]-r-r, hi = y[j]+r+r;
				for(int bs = 0; bs < 200; bs++) {
					double mid = (lo+hi)/2.0;
					if(dist(x[i], mid, x[j], y[j])-2*r <= 1e-7) lo = mid;
					else hi = mid;
				}
				if(dist(x[i], lo, x[j], y[j])-2*r <= 1e-7) best = Math.max(best, lo);
			}
			if(best == 0) y[i] = r;
			else y[i] = best;
		}
		for(int i = 0; i < n; i++) out.printf("%.6f ", y[i]);
		out.close();
	}
}