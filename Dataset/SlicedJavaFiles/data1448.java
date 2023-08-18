public class Main{	public static void main(String[] args) throws IOException {
		Kattio io = new Kattio(System.in);
		n = io.getLong();
		x = io.getLong();
		y = io.getLong();
		c = io.getLong();
//		for (int i = 0; i < 10; i++) io.println(f(i));
//		io.println();
		long lo = 0;
		long hi = c;
		while (lo < hi) {
			long mid = lo + (hi - lo) / 2;
			if (f(mid) >= c) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		io.println(lo);
		io.close();
	}
}