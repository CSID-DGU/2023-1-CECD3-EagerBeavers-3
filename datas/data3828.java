public class Main{	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String[] in = scan.readLine().split(" ");
		row = parse(in[0]);
		col = parse(in[1]);
		int k = parse(in[2]);
		
		int[][] xMove = new int[row][col-1];
		for(int i = 0; i < row; i++)
		{
			in = scan.readLine().split(" ");
			for(int j = 0; j < col - 1; j++)
				xMove[i][j] = parse(in[j]);
		}
		
		int[][] yMove = new int[row - 1][col];
		for(int i = 0; i < row - 1; i++)
		{
			in = scan.readLine().split(" ");
			for(int j = 0; j < col; j++)
				yMove[i][j] = parse(in[j]);
		}
		
		
		int[][] output = new int[row][col];
		
		if(k % 2 != 0)
			fill(-1, output);
		
		else
		{
			Point[][] grid = new Point[row][col];
			for(int i = 0; i < row; i++)
				for(int j = 0; j < col; j++)
					grid[i][j] = new Point(i, j);
			
			parseMoves(grid, xMove, yMove);
			
			solve(grid, k, output);
		}
		
		print(output, out);
		
		out.flush();
	}
}