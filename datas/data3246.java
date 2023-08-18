public class Main{	public static void main(String args[]) {
		InputStream intputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(intputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskA solver = new TaskA();
		solver.solve(in, out);
		out.close();
	}
}