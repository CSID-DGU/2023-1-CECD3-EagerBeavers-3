public class Main{	public static void main(String[] args) throws IOException {
		FastScanner fs = new FastScanner();
    	PrintWriter out = new PrintWriter(System.out);
    	
    	int tt = 1;
    	outer:
    	while(tt-->0) {
    		
    		int n = fs.nextInt(), T = fs.nextInt();
    		int[] t = new int[n], g = new int[n];
    		
    		for(int i=0;i<n;i++) {
    			t[i] = fs.nextInt(); g[i] = fs.nextInt();
    		}
    		
    		//dp[mask][pre] -- number of ways to order mask songs last song has prev genre
    		long[][] dp = new long[1<<n][4];
    		dp[0][0] = 1;
    		
    		long ans = 0;
    		
    		for(int mask=0;mask<(1<<n);mask++) {
    			for(int pre=0;pre<=3;pre++) {
    				for(int i=0;i<n;i++)
    					if((mask&(1<<i))==0 && g[i]!=pre) 
    						dp[mask^(1<<i)][g[i]] = add(dp[mask^(1<<i)][g[i]], dp[mask][pre]);
    				int sum = 0;
    				for(int i=0;i<n;i++) {
    					if((mask&(1<<i))!=0) sum += t[i];
    				}
    				if(sum==T) ans = add(ans, dp[mask][pre]);
    			}
    		}
    		
    		out.println(ans);
    		
    		
    		
    		
    		
    		
    	}
    	
    	out.close();
    }
}