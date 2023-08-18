public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder qq = new StringBuilder();
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		// int n = Integer.parseInt(in.readLine());
		String y[] = in.readLine().split(" ");
		long n = Long.parseLong(y[0]);
		long m = Long.parseLong(y[1]);

		if (m - n < 2) {
			System.out.println(-1);
		} else if (m - n == 2) {

			if (gcd(n, m) != 1)

				System.out.println(n + " " + (n + 1) + " " + (n + 2));

			else
				System.out.println(-1);
		} else {
			if (n % 2 == 0)
				System.out.println(n + " " + (n + 1) + " " + (n + 2));
			else
				System.out.println((n + 1) + " " + (n + 2) + " " + (n + 3));
		}

		out.close();

	}
}