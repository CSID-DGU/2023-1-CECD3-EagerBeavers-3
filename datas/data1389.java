public class Main{	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(System.out);
		Scanner scan = new Scanner(System.in);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
}