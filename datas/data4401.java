public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[n][m];
		diff=new int[n][n];
		s_e=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		
		dp=new int[n][n][70000];
		int ans=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{	
				Arrays.fill(dp[i][j], -1);
				diff[i][j]=Integer.MAX_VALUE;
				s_e[i][j]=Integer.MAX_VALUE;
				for(int k=0;k<m-1;k++)
				{	
					diff[i][j]=Math.min(Math.abs(a[i][k]-a[j][k]), diff[i][j]);
					s_e[i][j]=Math.min(Math.abs(a[i][k]-a[j][k+1]), s_e[i][j]);
				}
				diff[i][j]=Math.min(Math.abs(a[i][m-1]-a[j][m-1]), diff[i][j]);
			}
		
		for(int i=0;i<n;i++)
			ans=Math.max(ans, dp(i,i,1<<i));
		
		pw.print(ans);
		pw.close();
	}
}