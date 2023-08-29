public class Main{	public static void main(String[] args) {
		char[] cs = in.next().toCharArray();
		int n=cs.length;
		int[] x = new int[n];
		for(int i=0; i<n; ++i)
			x[i]=cs[i]-'0';
		long[] dp1 = new long[n+1];
		for(int i=0; i<n; ++i) 
			dp1[i+1]=(x[i]+dp1[i]*10)%M;
		//out.println(Arrays.toString(dp1));
		long ans=0;
		for(int d1=1; d1<=9; ++d1) {
			long[][] dp2 = new long[2][n+1];
			for(int i=0; i<n; ++i) {
				dp2[0][i+1]=x[i]>=d1?(10*dp2[0][i]+1)%M:dp2[0][i];
				dp2[1][i+1]=x[i]>=d1?(10*dp2[1][i]+dp1[i])%M:dp2[1][i];
				for(int d2=0; d2<x[i]; ++d2)
					dp2[1][i+1]=((d2>=d1?10*(dp2[0][i]+dp2[1][i])+dp1[i]+1:dp2[0][i]+dp2[1][i])+dp2[1][i+1])%M;
				for(int d2=x[i]+1; d2<=9; ++d2)
					dp2[1][i+1]=((d2>=d1?10*dp2[1][i]+dp1[i]:dp2[1][i])+dp2[1][i+1])%M;
			}
			ans+=dp2[0][n]+dp2[1][n];
			//out.println(dp2[0][n]+" "+dp2[1][n]);
		}
		out.println(ans%M);
		out.close();
	}
}