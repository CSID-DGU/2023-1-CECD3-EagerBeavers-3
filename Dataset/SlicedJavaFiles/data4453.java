public class Main{	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		int T = in.nextInt();
		for (int cT = 1; cT <= T; cT++) {
			Task solver = new Task();
			solver.solve(cT, in, out);
		}
		out.close();
	}
}