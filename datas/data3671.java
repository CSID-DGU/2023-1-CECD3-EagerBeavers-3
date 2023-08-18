public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner("input.txt");
		PrintWriter out = new PrintWriter("output.txt");
		// Scanner sc = new Scanner(System.in);
		// PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		b = new Pair[K];
		for (int i = 0; i < K; i++)
			b[i] = new Pair(sc.nextInt() - 1, sc.nextInt() - 1);

		Pair last = bfs();
		out.println((last.x) + " " + (last.y));
		out.flush();
		out.close();
	}
}