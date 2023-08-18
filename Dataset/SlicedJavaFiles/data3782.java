public class Main{	public static void main(String[] args)
	{
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		n = fs.nextInt(); m = fs.nextInt(); k = fs.nextInt();
		hor = new int[n][m]; ver = new int[n][m];
		dp = new long[505][505][24];
		for(int i=0;i<505;i++)for(int j=0;j<505;j++)for(int k=0;k<24;k++)dp[i][j][k] = -1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m-1;j++)
			{
				int a = fs.nextInt();
				hor[i][j] = a;
			}
		}
		
		for(int row=0;row<n-1;row++)
		{
			for(int col =0;col<m;col++)
			{
				int a = fs.nextInt();
				ver[row][col] = a;
			}
		}

		
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<m;col++)
			{
				long d = dist(row,col);
				if(d<Integer.MAX_VALUE)
				{
					out.print(d+" ");
				}
				else out.print("-1 ");
			}
			out.println();
		}
		out.close();
	}
}