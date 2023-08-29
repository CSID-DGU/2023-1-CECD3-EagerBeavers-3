public class Main{	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		long C = sc.nextLong();

		int lo = 0, hi = (int) (1e6);
		int answer = -1;
		while (lo <= hi) {
			int L = lo + (hi - lo) / 2;
			long area = 0;
			for (int steps = 0; steps <= L; ++steps) { // L + 1 steps to right
				if (y + steps > N)
					break;
				long up = Math.min(x, 1 + L - steps), down = Math.min(N - x, L - steps);
				area += up + down;
			}

			for (int steps = 1; steps <= L; ++steps) { // L steps to left
				if (y - steps < 1)
					break;
				long up = Math.min(x, 1 + L - steps), down = Math.min(N - x, L - steps);
				area += up + down;
			}
			if (area >= C) {
				answer = L;
				hi = L - 1;
			} else
				lo = L + 1;
		}
		out.println(answer);

		out.flush();
		out.close();
	}
}