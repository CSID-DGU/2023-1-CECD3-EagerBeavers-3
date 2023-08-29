public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), S = sc.nextLong();
		long lo = 0, hi = N;
		long pivot = 0;
		while (lo <= hi) {
			long mid = lo + (hi - lo) / 2;
			int sumOfDigits = 0;
			long saveMid = mid;
			while (saveMid > 0) {
				sumOfDigits += saveMid % 10;
				saveMid /= 10;
			}
			if (mid - sumOfDigits < S) {
				pivot = mid;
				lo = mid + 1;
			} else
				hi = mid - 1;
		}

		System.out.println(N - pivot);
	}
}