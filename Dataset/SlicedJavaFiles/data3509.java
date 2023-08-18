public class Main{	public static void main(String[] args) throws IOException {
		FastScanner fs = new FastScanner();
    	PrintWriter out = new PrintWriter(System.out);
    	
    	int tt = 1;
    	outer:
    	while(tt-->0) {
    		
    		n = fs.nextInt();
    		mod = fs.nextLong();
    		
    		dp = new long[N][N];
    		precompute();
    		
    		dp[0][0] = 1;
    		
    		for(int i=0;i<n;i++) {
    			for(int j=0;j<=i;j++) {
    				for(int k=1;i+k<=n;k++) {
    					dp[i+k+1][j+k] += (((dp[i][j]*pow[k-1])%mod)*C[j+k][k])%mod;
    					dp[i+k+1][j+k] %= mod;
    				}
    			}
    		}
    		
    		long ans = 0;
    		for(int i=0;i<=n;i++) {
    			ans = (ans + dp[n+1][i])%mod;
    		}
    		
    		out.println(ans);
    		
    		
    		
    		
    	}
    	
    	out.close();
    }
}