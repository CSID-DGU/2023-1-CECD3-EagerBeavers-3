public class Main{	public static void main(String[] args)
	{
		InputReader in = new InputReader(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = in.nextInt();
		double r = (double)in.nextInt();
		double [] a = new double[n];
		for(int i=0;i<n;i++)
			a[i] = (double)in.nextInt();
		double[] ans = new double[n];
		ans[0] = r;

		for(int i=1;i<n;i++)
		{
			double max = Double.MIN_VALUE;
			for(int j=0;j<i;j++)
			{
				if(Math.abs(a[i]-a[j])<=2*r)
				{
					//System.out.println(j);
					double cur = 4*r*r;
					cur -= ((a[i]-a[j])*(a[i]-a[j]));
					cur = Math.sqrt(cur);
					cur += ans[j];
					//System.out.println(r);
					max = Math.max(max, cur);
				}
			}
			
			if(max == Double.MIN_VALUE)
				ans[i] = r;
			else 
				ans[i] = max;
		}
		
		for(int i=0;i<n;i++)
			pw.print(ans[i] + " ");
		pw.flush();
		pw.close();
	}
}