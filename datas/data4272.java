public class Main{	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.ENGLISH);
		if (fileIOMode) {
			in = new BufferedReader(new FileReader(problemName + ".in"));
			out = new PrintWriter(problemName + ".out");
		} else {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
		}
		tokenizer = new StringTokenizer("");

		new Thread(new flags1225()).start();
	}
}