public class Main{	public static void main(String[] args)throws Exception
	{
		Scanner scan= new Scanner(System.in);
		init();
		n=scan.nextInt();
		int m= (1<<n)-1;
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				prob[i][j]= scan.nextDouble();
		dp[0][m]=1;
		
		for(int i=0; i<(n-1); i++)
		{
			for(int j=0; j<=m; j++)
				if(dp[i%2][j]>0)
					for(Integer next: adj[j])
						dp[(i+1)%2][next]+= value(j,next)*dp[i%2][j];
			Arrays.fill(dp[i%2],0);
		}
	
		for(int i=0; i<n; i++)
		{
			if(i!=0)
			System.out.print(" ");
			System.out.printf("%.6f",dp[(n-1)%2][1<<i]);		
		}
		
	}
}