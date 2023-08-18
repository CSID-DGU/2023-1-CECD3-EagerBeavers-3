public class Main{	public static void main(String[] args) throws Exception {
		BitSet primes = primes(1001);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= N; ++i) {
			if (!primes.get(i)) continue;
			int res = i - 1;
			boolean found = false;
			for (int j = 2; j <= i / 2; ++j) {
				if (primes.get(j) && primes.nextSetBit(j + 1) == res - j) {
					found = true;
					break;
				}
			}
			if (found) {
				++count;
			}
		}
		System.out.println(count >= K ? "YES" : "NO");
	}
}