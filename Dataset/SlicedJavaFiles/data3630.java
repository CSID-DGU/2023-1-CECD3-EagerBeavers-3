public class Main{	public static void main(String[] args) throws IOException {
		FastReader input = new FastReader();
		PrintWriter out = new PrintWriter("output.txt");

		n = input.nextInt();
		m = input.nextInt();
		grid = new int[n][m];

		int k = input.nextInt();

		for (int i = 0; i < n; i++) {
			Arrays.fill(grid[i], Integer.MAX_VALUE);
		}

		Queue<Pair> q = new LinkedList<Pair>();

		for (int i = 0; i < k; i++) {
			int x = input.nextInt() - 1;
			int y = input.nextInt() - 1;

			q.add(new Pair(x, y));
			grid[x][y] = 0;

			while (!q.isEmpty()) {
				Pair cur = q.poll();
				for (int j = 0; j < dr.length; j++) {
					int r = cur.x;
					int c = cur.y;
					int nr = r + dr[j];
					int nc = c + dc[j];
					int dist = grid[r][c] + 1;

					if (isValid(nr, nc) && grid[nr][nc] > dist) {
						grid[nr][nc] = dist;

						q.add(new Pair(nr, nc));
					}

				}
			}
		}

		int max = -1;
		int x = -1;
		int y = -1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] > max) {
					max = grid[i][j];
					x = i + 1;
					y = j + 1;
				}
			}
		}
		out.println(x + " " + y);
		out.flush();
	}
}