public class Main{	public static void main(String[] args) throws IOException
	{
		// StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		FastScanner sc = new FastScanner();
		int dp[][]=new int[6000][6000];
		char a[]=new char[6000];
		final int n=sc.nextInt();
		boolean flag=false;
		int cnt=0;
		char pre='f';
		for(int i=1;i<=n;i++)
		{
			 a[i]=sc.next().charAt(0);

		}
		dp[1][1]=1;
		final int mod=(int)1e9+7;
		dp[1][1]=1;
		for(int i=2;i<=n;i++)
		{
			if(a[i-1]=='s')
			{
				int now=0;
				for(int j=5050;j>=1;j--)
				{
					now=(now+dp[i-1][j])%mod;
					dp[i][j]=now;
				}
			}
			else
			{
				for(int j=5050;j>=1;j--)
				{
					dp[i][j]=dp[i-1][j-1]%mod;
				}
			}
		}
		int ans=0;
		for(int i=0;i<=5050;i++)
		{
			ans+= dp[n][i]%mod;
			ans%=mod;
		}
		out.println(ans%mod);

		out.flush();
	}
}