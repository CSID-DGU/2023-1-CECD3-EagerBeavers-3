public class Main{	public static void main(String[] args) throws IOException {
		FastScanner in= new FastScanner(System.in);
		PrintWriter out= new PrintWriter(System.out);
		
		int n= in.nextInt();
		int r= in.nextInt();
		int [] x= new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i]= in.nextInt();
		}
		double [] res= new double[n];
		res[0]= r;
		for (int i = 1; i < x.length; i++) {
			boolean found = false;
			for (int j = 0; j < i; j++) {
				double dis= Math.abs(x[i]-x[j]);
				double rr= 4.0*r*r-1.0*dis*dis;
				if(rr>=0) {
					double del= Math.sqrt(rr);
					res[i]= Math.max(res[i], res[j]+del);
					found= true;
				}
			}
			if(!found) {
				res[i]= r;
			}
		}
		for (int i = 0; i < res.length; i++) {
			out.print(res[i]+" ");
		}
		out.close();
		
	}
}