public class Main{	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner("input.txt");
		PrintWriter out = new PrintWriter("output.txt");
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] grid = new int[n][m];
		for (int[] i : grid)
			Arrays.fill(i, -1);
		Queue<Pair> q = new LinkedList<>();
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int x = sc.nextInt() - 1, y = sc.nextInt() - 1;
			grid[x][y] = 0;
			q.add(new Pair(x, y));
		}
		Pair p = new Pair(-1, -1);
		while (!q.isEmpty()) {
			p = q.poll();
			for (int i = 0; i < dx.length; i++) {
				int tx = p.x + dx[i], ty = p.y + dy[i];
				if (tx >= 0 && tx < n && ty >= 0 && ty < m && grid[tx][ty] == -1) {
					grid[tx][ty] = grid[p.x][p.y] + 1;
					q.add(new Pair(tx, ty));
				}
			}
		}
		out.println(p);
		out.flush();
		out.close();
	}
}