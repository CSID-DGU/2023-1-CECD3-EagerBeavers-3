public class Main{	public static void main(String[] arg){
		FastScanner scan = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = scan.nextInt();
		
		double ncr[][] = new double[n+1][n+1];
		ncr[1][0] = ncr[0][1] = ncr[1][1] = 1.0;
		for(int i = 2; i <= n; i++){
			for(int j = 0; j <= i; j++){
				if(j == 0 || j == i) ncr[i][j] = 1.0;
				else ncr[i][j] = ncr[i-1][j] + ncr[i-1][j-1];
				//System.out.print(ncr[i][j] + "  ");
			}
			//System.out.println();
		}
		
		double a[][] = new double[n+1][n+1];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				a[i][j] = scan.nextDouble();
		
		double dp[] = new double[1<<19];
		dp[(1<<n) - 1] = 1.0;
		for(int state = (1 << n) - 1; state >= 0; state--){
			int len = 0;
			for(int i = 0; i < n; i++)
				if((state & (1 << i)) > 0) len++;
			
			for(int i = 0; i < n; i++){
				if(((1 << i) & state) == 0) continue;
				for(int j = 0; j < i; j++){
					if(((1 << j) & state) == 0) continue;
					dp[state & (~(1<<i))] += (dp[state] * a[j][i] / ncr[len][2]);
					dp[state & (~(1<<j))] += (dp[state] * a[i][j] / ncr[len][2]);
					//System.out.println(state + " / " + (state & (~(1<<i))) + " / " + dp[state] + " / " + a[j][i] + " / " + (dp[state] * a[j][i]) + " / "  + dp[state & (~(1<<i))]);
					//System.out.println(state + " / " + (state & (~(1<<j))) + " / " + dp[state] + " / " + a[i][j] + " / " + (dp[state] * a[i][j]) + " / "  + dp[state & (~(1<<j))]);
					//System.out.println();
				}
			}
		}
		for(int i = 0; i < n; i++)
			System.out.print(String.format("%.6f", dp[1<<i]) + " ");
		out.close();
	}
}