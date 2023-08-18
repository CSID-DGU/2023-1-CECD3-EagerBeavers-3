public class Main{	public static void main(String[] args) {
		FastReader sc = new FastReader();
		// int t = sc.nextInt();
		// while (t-- > 0) {
		long n = sc.nextLong();

		if (n < 10) {
			System.out.println(n);
			return;
		} else {
			long sum = 0;
			long cur = 9;
			long prev = 0;
			int count = 1;

			while (n > cur) {
				n -= cur ;
				sum += cur / count;
				prev = cur;
				cur = 9 * (count + 1) * (long)Math.pow(10, count);
				count ++;
			}

			sum = sum + (n / count);

			if (n % count == 0) {
				System.out.println(sum % 10);
			} else {
				sum++;
				n = n % count;
				String s = String.valueOf(sum);
				System.out.println(s.charAt((int)n - 1));
			}
			// }
		}
	}
}