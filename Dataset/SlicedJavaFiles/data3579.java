public class Main{	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner("input.txt");
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
		
		int n,m;
		n = scan.nextInt();
		m = scan.nextInt();

		boolean visited[][] = new boolean[n][m];
    
		int numOfStartingPoints;
		numOfStartingPoints = scan.nextInt();
		    		
		int resX = 0, resY = 0;
		
		Queue<Point> que = new LinkedList<Point>();
		for (int i = 0; i < numOfStartingPoints; i++) {
			int x = scan.nextInt() - 1;
			int y = scan.nextInt() - 1;
			que.add(new Point(x, y));
			visited[x][y] = true;
		}
		
		while (true) {
			Point current = que.poll();

			if (current == null) {
				break;
			} else {
				resX = current.x;
				resY = current.y;
				
				if (current.x + 1 < n && !visited[current.x + 1][current.y])
				{
					que.add(new Point(current.x + 1, current.y));
					visited[current.x + 1][current.y] = true;


				}
				if (current.y + 1 < m && !visited[current.x][current.y + 1])
				{
					que.add(new Point(current.x, current.y + 1));
					visited[current.x][current.y + 1] = true;
		

				}
				if (current.x - 1 >= 0 && !visited[current.x - 1][current.y])
				{
					que.add(new Point(current.x - 1, current.y));
					visited[current.x - 1][current.y] = true;
				
				}
				if (current.y - 1 >= 0 && !visited[current.x][current.y - 1])
				{
					que.add(new Point(current.x, current.y - 1));
					visited[current.x][current.y - 1] = true;
				
				}

				
			}
		}
		
		
		out.printf("%d %d\n", ++resX, ++resY);
		out.close();
		    
	}
}