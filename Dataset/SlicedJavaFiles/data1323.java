public class Main{	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long x = s.nextLong(), k = s.nextLong();
		if (x == 0) {
			System.out.println(0);
			return;
		}
		long max = x % mod;
		long temp = power(2, k, mod);
		temp %= mod;
		max = (max % mod) * (temp % mod);
		max %= mod;
		long min = max % mod;
		min = mod(min - (temp - 1));
		min %= mod;
		long num = mod(max - min + 1);
		long n = num % mod;
		n = (n % mod) * (min % mod + max % mod);
		n = n % mod;
		n %= mod;
		long ans = n % mod * modInverse(num, mod);
		System.out.println(ans % mod);

	}
}