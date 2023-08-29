public class Main{	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		n=fs.nextInt();
		mod=fs.nextInt();
		precomp();
		dp=new long[n+1][n+1];
		for (int i=0; i<dp.length; i++) Arrays.fill(dp[i], -1);
		
		long ans=0;
		for (int nXsLeft=2; nXsLeft<=n; nXsLeft++) {
			long curAns=go(0, nXsLeft);
			ans=add(ans, curAns);
		}
		System.out.println(ans);
	}
}