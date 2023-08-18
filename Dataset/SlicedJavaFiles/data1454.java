public class Main{	public static void main(String[] args) {
		MScanner sc = new MScanner();
		PrintWriter out = new PrintWriter(System.out);

		long N = sc.nextLong();
		long X = sc.nextLong();
		long Y = sc.nextLong();
		long C = sc.nextLong();

		long low = 0;
		long high = N*2;
		long mid = 0;
		long ans = 0;
		while (low <= high) {
			mid = (low + high) >> 1;
			long painted = F(mid, X-1, Y-1, N);
			if (painted < C) {
				low = mid + 1;
			} else {
				ans = mid;
				high = mid - 1;
			}
		}
		out.println(ans);
		out.close();

	}
}