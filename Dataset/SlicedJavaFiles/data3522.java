public class Main{	public static void main(String[] havish) throws Exception{
		// TODO Auto-generated method stub
 		sc = new MyScanner();
 		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		mod = sc.nextLong();
		long[] fact = new long[401];
		long[] twopowers = new long[401];
		fact[0] = 1;
		twopowers[0] = 1;
		for(int j = 1;j<=400;j++){
			twopowers[j] = twopowers[j-1] * 2L;
			twopowers[j] %= mod;
			fact[j] = fact[j-1] * j;
			fact[j] %= mod;
		}
		long[][] choose = new long[401][401];
		for(int j = 0;j<=400;j++){
			for(int k = 0;k<=j;k++){
				choose[j][k] = fact[j];
				choose[j][k] *= inv(fact[k]);
				choose[j][k] %= mod;
				choose[j][k] *= inv(fact[j-k]);
				choose[j][k] %= mod;
			}
		}
		long[][] dp = new long[n+1][n+1]; //prefix, # of autos
		for(int j = 1;j<=n;j++){
			dp[j][0] = twopowers[j-1];
		}
		for(int k = 0;k<n;k++){  //number of autos
			for(int j = 1;j<=n;j++){ //prefix
				if (k > j)
					continue;
				for(int add = 2; j+add <= n; add++){
					long prod = dp[j][k] * choose[j-k+add-1][add-1];
					prod %= mod;
					prod *= twopowers[add-2];
					
					dp[j+add][k+1] += prod;
					dp[j+add][k+1] %= mod;
				}
			}
		}
		long ans = 0;
		for(int s = 0;s<=n;s++){
			ans+=dp[n][s];
			ans %= mod;
		}
		out.println(ans);
 		out.close();
 		
 	}
}