public class Main{	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		n = in.nextInt();
		fact = new long[301];
		fact[0] = 1;
		for (int i = 1; i < fact.length; i++) {
			fact[i] = fact[i - 1] * i;
			fact[i] %= MOD;
		}
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		fs = new int[n];
		for (int i = 0; i < n; i++) {
			long v = in.nextLong();
			long r = 1;
			for (int d = 2; d * d <= v; d++) {
				int cnt = 0;
				while (v % d == 0) {
					v /= d;
					cnt ^= 1;
				}
				if (cnt == 1) {
					r *= d;
				}
			}
			r *= v;
			if (!map.containsKey(r)) {
				map.put(r, map.size());
			}
			fs[map.get(r)]++;
		}
		cfs = new int[n];
		for (int i = 1; i < n; i++) {
			cfs[i] = cfs[i - 1] + fs[i - 1];
		}
		memo = new long[n+1][n+1];
		for(long[] arr : memo)
			Arrays.fill(arr, -1);
		System.out.println(go(0, 0));
	}
}