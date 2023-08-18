public class Main{    public static void main (String[] args) throws java.lang.Exception {
    	int test=1;
    	//test=sc.nextInt();
    	while(test-->0) {
    		int n = sc.nextInt();
    		MOD = sc.nextLong();
    		memo = new long[n+1];
    		fill(n);
    		long dp[][] = new long[n+5][n+5];
    		for(int i=1;i<=n;i++) dp[i][i]=exp(2,i-1);
    		for(int i = 2; i <= n; i++) {
    			for(int j = 1; j < i; j++) {
    				for(int k = 1; k <= j; k++) {
    					long val = (dp[i-k-1][j-k]*C[j][k])%MOD;
    					if(memo[k-1] ==0) memo[k-1] = exp(2, k-1);
    					val=(val*memo[k-1])%MOD;
    					dp[i][j]=(dp[i][j]+val)%MOD;
    				}
    			}
    		}
    		long ans = 0;
    		for(int i=0;i<=n;i++) ans=(ans+dp[n][i])%MOD;
    		out.println(ans);
    	}
        out.flush();
        out.close();
    }
}