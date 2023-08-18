public class Main{	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FastScanner in = new FastScanner(System.in);
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		
		int T = 1;
		Solver A = new Solver(in, out); 
		
		for(int aa = 0; aa < T; aa++) {
			A.answer(aa + 1);
		}
		
		
		out.close();
	}
}