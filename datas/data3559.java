public class Main{	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner();
		int n = in.nextInt() ; 
		int m = in.nextInt(); 
		int k = in.nextInt(); 
		int x[] = new int[k] ; 
		int y[] = new int[k] ; 
		int trees [][] = new int [n][m] ;


		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				trees[i][j]=Integer.MAX_VALUE ;

		for (int i = 0; i < k; i++)
		{
			x[i]=in.nextInt()-1; 
			y[i]=in.nextInt()-1;
			trees[x[i]][y[i]]=0 ;
		}

		int dis = Integer.MIN_VALUE ; ;
		int xp=0; ;
		int yp=0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				if(trees[i][j] != 0)
					for (int j2 = 0; j2 < k; j2++)
						trees[i][j]=Math.min(trees[i][j], Math.abs(i-x[j2])+Math.abs(j-y[j2]));

		for (int i = 0; i <n; i++)
			for (int j = 0; j < m; j++)
				if(trees[i][j] > dis)
				{
					dis=trees[i][j];
					xp=i+1;
					yp=j+1;
				}
		PrintWriter out = new PrintWriter("output.txt");
		out.printf("%d %d\n", xp ,yp);
		out.close();
	}
}