public class Main{	public static void main(String[] args) throws IOException {
		InputReader input = new InputReader(new FileReader(("input.txt")));
		int n = input.nextInt();
		int m = input.nextInt();
		int k = input.nextInt();
		boolean[][] visited = new boolean[n][m];
		Queue<Point> bfs = new LinkedList<Point>();
		for (int i = 0; i < k; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			visited[x - 1][y - 1] = true;
			bfs.add(new Point(x - 1, y - 1));
		}
		Point last = bfs.peek();
		while(!bfs.isEmpty()) {
			Point current = bfs.poll();
			int curX = current.x;
			int curY = current.y;
			//the upper tree
			if(curX - 1 >= 0) {
				if(!visited[curX - 1][curY]) {
					bfs.add(new Point(curX - 1,curY));
					visited[curX - 1][curY] = true;
				}
			}
			//the tree to the right
			if(curY + 1 < m) {
				if(!visited[curX][curY + 1]) {
					bfs.add(new Point(curX ,curY + 1));
					visited[curX][curY + 1] = true;
				}
			}
			//the lower tree
			if(curX + 1 < n) {
				if(!visited[curX + 1][curY]) {
					bfs.add(new Point(curX + 1,curY));
					visited[curX + 1][curY] = true;
				}
			}
			//the point to the left
			if(curY - 1 >= 0) {
				if(!visited[curX][curY - 1]) {
					bfs.add(new Point(curX ,curY - 1));
					visited[curX][curY - 1] = true;
				}
			}
			if(bfs.peek()!= null)
			last = bfs.peek();
		}
		PrintWriter out = new PrintWriter(new File("output.txt"));
		out.println((last.x + 1) + " " + (last.y + 1));
		out.close();
		//System.out.println((last.x + 1) + " " + (last.y + 1));
	}
}