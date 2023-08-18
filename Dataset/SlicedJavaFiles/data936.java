public class Main{	public static void main(String[] args) throws FileNotFoundException {
		Solver solver = new Solver();
		scan = new FastReader();
		out = new PrintWriter(System.out);
		int testCases = 1;
		for(int i = 1; i <= testCases; i++) {
//			out.print("Case #" + i + ": ");
			solver.solve();	
		}
		out.close();
	}
}