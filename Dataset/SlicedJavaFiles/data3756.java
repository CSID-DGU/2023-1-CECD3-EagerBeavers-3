public class Main{	public static void main(String[] args) {
		int n=in.nextInt();
		fac = new long[n+1];
		faci = new long[n+1];
		fac[0]=faci[0]=1;
		for(int i=1; i<=n; ++i)
			faci[i]=modI(fac[i]=fac[i-1]*i%M, M);
		List<List<Integer>> grps = new ArrayList<List<Integer>>();
		for(int i=0; i<n; ++i) {
			int ai=in.nextInt();
			for(int j=0; ; ++j) {
				if(j>=grps.size())
					grps.add(new ArrayList<Integer>());
				if(grps.get(j).size()>0&&!ps((long)grps.get(j).get(0)*ai))
					continue;
				grps.get(j).add(ai);
				break;
			}
		}
		long[][] dp = new long[grps.size()][n-grps.size()+1];
		dp[0][grps.get(0).size()-1]=fac[grps.get(0).size()];
		int ad=grps.get(0).size();
		for(int i=1; i<grps.size(); ++i) {
			for(int j=0; j<dp[i-1].length; ++j) {
				if(dp[i-1][j]==0)
					continue;
				for(int k=0; k<grps.get(i).size(); ++k)
					for(int l=Math.max(grps.get(i).size()+j-k-ad-1, 0); l<=Math.min(grps.get(i).size()-k, j); ++l)
						dp[i][j+k-l]=(fac[grps.get(i).size()]*nck(j, l)%M*nck(ad+1-j, grps.get(i).size()-k-l)%M*nck(grps.get(i).size()-1, k)%M*dp[i-1][j]+dp[i][j+k-l])%M;
			}
			ad+=grps.get(i).size();
		}
		//out.println(Arrays.deepToString(dp));
		out.println(dp[grps.size()-1][0]);
		out.close();
	}
}