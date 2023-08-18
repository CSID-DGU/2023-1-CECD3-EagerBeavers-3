public class Main{	public static void main(String[] argv)
	{
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();
		if(n<m){
			int t = m;
			m = n;
			n = t;
		}

		maxm = 1<<m;
		int i,j,k,l;
		dp = new int[n+1][1<<m][1<<m];
		s = new int[1<<m];

		for(i=0;i<n+1;i++){
			for(j=0;j<maxm;j++){
				Arrays.fill(dp[i][j],100);
			}
		}

		for(i=0;i<maxm;i++){
			s[i] = cal(i);
			dp[0][0][i] = 0;
		}

		for(i=1;i<=n;i++){
			for(j=0;j<maxm;j++){
				for(k=0;k<maxm;k++){
					for(l=0;l<maxm;l++){
						if(dp[i-1][k][l]!=100 && check(k,l,j)){
							dp[i][l][j] = Math.min(dp[i-1][k][l]+s[l],dp[i][l][j]);
						}
					}
				}
			}
		}

		int ans = 100;
		for(i=0;i<maxm;i++)
			ans = Math.min(dp[n][i][0],ans);

		System.out.println(n*m-ans);
		return;
	}
}