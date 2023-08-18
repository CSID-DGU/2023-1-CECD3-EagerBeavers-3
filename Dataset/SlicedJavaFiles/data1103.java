public class Main{	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		if (N / 2 % 2 == 1) {
			output(-1, out);
		} else {
			int half = N / 2;
			int l = 1, r = half;
			int first = query(half, out, sc);
			int next = query(2 * half, out, sc);
			if (first == next) {
				output(half, out);
				return;
			}
			boolean less = first < next;
			while (l + 1 < r) {
				int med = (l + r) / 2;
				first = query(med, out, sc);
				next = query(med + half, out, sc);
				if (first == next) {
					output(med, out);
					return;
				} else if (first < next == less) {
					r = med;
				} else {
					l = med + 1;
				}
			}
			output(l, out);
		}
	}
}