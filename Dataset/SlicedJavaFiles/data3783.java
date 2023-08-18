public class Main{	public static void main(String[] args) throws IOException {
		boolean oj = true;
		if (oj) {
			sc = new FastScanner();
			out = new PrintWriter(System.out);
		} else {
			sc = new FastScanner(100);
			out = new PrintWriter("output.txt");
		}
		int t = 1;
//		t = sc.nextInt();
		while (t-- > 0) {
			process();
		}
		out.flush();
		out.close();
	}
}