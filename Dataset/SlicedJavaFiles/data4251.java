public class Main{	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner(System.in);
		FastPrinter out = new FastPrinter(System.out);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			new E1().run(sc, out);
		}
		out.close();
	}
}