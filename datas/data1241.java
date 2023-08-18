public class Main{	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		long k = in.nextLong();
		
		long ans = 0;
		
		long t = (k - 1) * (n - m);
		
		if (t <= m) {
			n -= k * (n - m);
			
			long g = n / k;
			
			ans = 2 * k * (powmod(g) - 1) + n % k;
			
			ans = (ans + t) % MOD;
		}
		else {
			ans = m;
		}
		
		System.out.println(ans % MOD);
	}
}