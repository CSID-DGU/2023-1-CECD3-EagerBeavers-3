public class Main{	public static void main(String[] args) {
		char[] cs = in.next().toCharArray();
		n=cs.length;
		x = new int[n];
		for(int i=0; i<n; ++i)
			x[i]=cs[i]-'0';
		p10 = new long[n];
		p10[0]=1;
		for(int i=1; i<n; ++i)
			p10[i]=p10[i-1]*10%M;
		s = new long[n+1];
		s[n]=1;
		for(int i=n-1; i>=0; --i)
			s[i]=(s[i+1]+x[i]*p10[n-1-i])%M;
		long ans=0;
		dp = new long[2][n][n+1];
		for(dig=1; dig<=9; ++dig) {
			for(int i=0; i<n; ++i) {
				Arrays.fill(dp[0][i], -1);
				Arrays.fill(dp[1][i], -1);
			}
			for(int i=1; i<=n; ++i)
				ans=(ans+p10[i-1]*dp(0, 0, i))%M;
		}
		out.println(ans);
		out.close();
	}
}