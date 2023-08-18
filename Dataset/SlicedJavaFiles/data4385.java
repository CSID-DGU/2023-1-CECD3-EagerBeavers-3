public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		boolean[][] g = new boolean[n][n];
		boolean[] ok = new boolean[1<<n];
		int[] f = new int[1<<n];
		for(int i=1; i<(1<<n); i++) {
			ok[i] = Integer.bitCount(i)>=3;
			f[i] = first(i);
		}
		for(int i=0; i<m; i++) {
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			g[a][b] = g[b][a] = true;
		}
		long[][] dp = new long[n][1<<n];
		for(int i=0; i<n; i++)
			dp[i][1<<i] = 1;
		for(int i=1; i<(1<<n); i++)
			for(int j=0; j<n; j++)
				for(int k=f[i]+1; k<n; k++)
					if((i&(1<<k)) == 0 && g[j][k])
						dp[k][i^(1<<k)] += dp[j][i];
		long ret = 0;
		for(int i=1; i<(1<<n); i++)
			for(int j=0; j<n; j++)
				if(ok[i] && j != f[i])
					ret += g[j][f[i]]?dp[j][i]:0;
		System.out.println(ret/2);
	}
}