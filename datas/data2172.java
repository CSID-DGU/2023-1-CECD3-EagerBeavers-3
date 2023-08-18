public class Main{	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		n = sc.nextInt();
		r = sc.nextInt();
		x = new int[n];
		ans = new double[n];
		for (int i=0;i<n;i++)
			x[i] = sc.nextInt();
		for (int i=0;i<n;i++)
		{
			ans[i] = r;
			for (int j=0;j<i;j++)
			{
				if (Math.abs(x[i]-x[j])>2*r)
					continue;
				int deltaxsq = (x[i]-x[j])*(x[i]-x[j]);
				int deltaysq = 4 * r * r - deltaxsq;
				double deltay = Math.sqrt(deltaysq);
				ans[i] = Math.max(ans[i], ans[j]+deltay);
			}
			pw.print(ans[i]+" ");
		}
		pw.flush();
		pw.close();
	}
}