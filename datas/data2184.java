public class Main{	public static void main(String[] args) {
		FastScanner in = new FastScanner();
		int n = in.nextInt();
		double r = in.nextInt();
		double x[] = new double[n];
		for(int i = 0; i < n; i++)
			x[i] = in.nextDouble();
		
		double y[] = new double[n];
		y[0] = r;
		
		for(int i = 1; i < n; i++){
			double miny = r;
			for(int j = 0; j < i; j++){
				double dx = Math.abs(x[i]-x[j]);
				if(dx > r*2) continue;
				double yy = Math.sqrt(4*r*r-dx*dx);
				miny = Math.max(miny, yy+y[j]);
			}
			y[i] = miny;
		}
		for(int i = 0; i < n; i++){
			System.out.print(y[i]+" ");
		}
		

	}
}