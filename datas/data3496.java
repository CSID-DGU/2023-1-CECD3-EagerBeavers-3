public class Main{	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		EPhoenixAndComputers solver = new EPhoenixAndComputers();
		solver.solve(1, in, out);
		out.close();
	}
}