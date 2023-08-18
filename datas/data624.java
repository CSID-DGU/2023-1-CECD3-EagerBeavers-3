public class Main{	public static void main(String[] args)
	{
		InputReader in = new InputReader(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = in.nextInt();
		long d = in.nextLong();
		long[]a = new long[n];
		for(int i=0;i<n;i++)
			a[i] = in.nextLong();
		int ans = 1;
		for(int i=0;i<n-1;i++)
		{
			long x = a[i+1]-a[i];
			if(x==2*d)
				ans++;
			else if(x>2*d)
				ans+=2;
			//System.out.println(ans);
		}
		ans++;
		pw.print(ans);
		pw.flush();
		pw.close();
	}
}