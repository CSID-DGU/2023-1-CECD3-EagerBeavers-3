public class Main{	public static void main(String[] args) throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("input.txt");
		OutputStream outputStream = new FileOutputStream("output.txt");
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(in, out);
		out.close();
	}
}