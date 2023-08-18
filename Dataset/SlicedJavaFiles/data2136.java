public class Main{	public static void main(String[] args) throws FileNotFoundException {
		if(!taskName.isEmpty()) {
			System.setIn(new BufferedInputStream(new FileInputStream(taskName + ".in")));
			System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(taskName + ".out"))));
		}
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Main main = new Main();
		main.run(in, out);
		out.close();
	}
}