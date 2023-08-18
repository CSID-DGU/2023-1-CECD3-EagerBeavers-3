public class Main{	public static void main(String[] args) {
		InputStream inputStream;
		try {
			inputStream = new FileInputStream("input.txt");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		OutputStream outputStream;
		try {
			outputStream = new FileOutputStream("output.txt");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		PandaScanner in = new PandaScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		C solver = new C();
		solver.solve(1, in, out);
		out.close();
	}
}