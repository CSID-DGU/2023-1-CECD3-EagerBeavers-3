public class Main{    public static void main(String[] args) {
    	int n = sc.nextInt();
    	int T = sc.nextInt();
    	int[] t = new int[n];
    	int[] g = new int[n];
    	for(int i=0; i<n; i++) {
    		t[i] = sc.nextInt();
    		g[i] = sc.nextInt() - 1;
    	}
    	long[][][] dp = new long[T+1][3][1 << 15];
    	for(int i=1; i<=T; i++) {
    		for(int j=0; j<n; j++) {
    			if(i - t[j] == 0) {
    				dp[i][g[j]][1 << j] = (dp[i][g[j]][1 << j] + 1) % mod;
    			} else if(i - t[j] > 0) {
    				for(int k=0; k<(1 << 15); k++) {
    					if((k >> j & 1) == 1) {
    						continue;
    					}
    					dp[i][g[j]][k + (1 << j)] = (dp[i][g[j]][k + (1 << j)] + dp[i - t[j]][(g[j] + 1) % 3][k] + dp[i - t[j]][(g[j] + 2) % 3][k]) % mod;
    				}
    			}
    		}
    	}
    	long ans = 0;
    	for(int j=0; j<3; j++) {
    		for(int k=0; k<(1 << 15); k++) {
    			ans = (ans + dp[T][j][k]) % mod;
    		}
    	}
    	System.out.println(ans);
    }
}