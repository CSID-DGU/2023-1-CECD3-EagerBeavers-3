public class Main{	public static void main(String[] args) throws NumberFormatException,
			IOException {
		Locale.setDefault(Locale.US);

		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
				System.out)));
		long a = nextLong();
		long b = nextLong();
		if (a % 2 == 1 && b - a == 2 || b - a == 1 || a == b) {
			pw.print(-1);
		} else {
			if (a % 2 == 1)
				a++;
			pw.print(a + " " + (a + 1) + " " + (a + 2));
		}
		pw.close();
	}
}