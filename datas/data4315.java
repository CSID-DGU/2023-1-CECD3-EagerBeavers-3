public class Main{		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			InputStream inputstream = System.in;
			OutputStream outputstream = System.out;
			FastReader in = new FastReader(inputstream);
			PrintWriter out = new PrintWriter(outputstream);
			TaskA solver = new TaskA();
			// int testcase = in.ni();
			for (int i = 0; i < 1; i++)
				solver.solve(i, in, out);
			out.close();
	
		}
}