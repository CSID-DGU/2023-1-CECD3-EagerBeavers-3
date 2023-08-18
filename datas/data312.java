public class Main{	public static void main(String[] args) throws IOException {

		if (stdin) {
			br = new FastScanner();
			pw = new PrintWriter(new OutputStreamWriter(System.out));
		} else {
			br = new FastScanner(filename + ".in");
			pw = new PrintWriter(new FileWriter(filename + ".out"));
		}

		Solver solver = new Solver();
		solver.solve(br, pw);
	}
}