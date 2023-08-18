public class Main{	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FireAgain F = new FireAgain();
		 Scanner in = new Scanner (new FileReader("input.txt"));
		 F.out = new PrintStream(new File("output.txt"));
	
		F.x = in.nextInt();
		F.y = in.nextInt();

		int l = 0;
		F.vis = new boolean[F.x + 1][F.y + 1];

		int k = in.nextInt();

		for (int i = 0; i < k; i++) {
			Point P = new Point(in.nextInt(), in.nextInt());
			F.vis[P.x][P.y] = true; // add in set
			F.q.add(P);
		}

		F.bfs(F.q.peek());

	}
}