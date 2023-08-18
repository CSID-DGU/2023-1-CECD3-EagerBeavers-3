public class Main{	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		Solver solver = new Solver();
		solver.solve(s, out);

		out.close();

	}
}