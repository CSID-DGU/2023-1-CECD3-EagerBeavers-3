public class Main{	public static void main(String[] args) throws IOException{
		int n = nextInt(),
			t = nextInt(),
			x[] = new int[n],
			a[] = new int[n];
		
		for (int i=0; i<n; i++){
			x[i] = nextInt();
			a[i] = nextInt();
		}
		
		for (int i=0; i<n-1; i++)
			for (int j=i+1; j<n; j++)
				if (x[i] > x[j]){
					int p = x[i]; x[i] = x[j]; x[j] = p;
						p = a[i]; a[i] = a[j]; a[j] = p;
				}
		
		double l[] = new double[n];
		double r[] = new double[n];
		for (int i=0; i<n; i++){
			l[i] = x[i]-a[i]/2.0;
			r[i] = x[i]+a[i]/2.0;
		}
		
		int res = 2;
		for (int i=1; i<n; i++){
			if (Math.abs(l[i]-r[i-1]-t) < 0.000001) res++;
			else if (l[i]-r[i-1] > t) res += 2;
		}
		
		out.println(res);
		out.flush();
	}
}