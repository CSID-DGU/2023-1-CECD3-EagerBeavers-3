public class Main{	public static void main(String[] args) {
		FastScanner input = new FastScanner(System.in);
		
		long x = input.nextLong();
		long k = input.nextLong();
		
		long[][] matrix = {
			{2, MOD - 1},
			{0, 1}
		};
		
		if (x == 0)
			System.out.println(0);
		else if (k == 0) {
			System.out.println((x * 2) % MOD);
		} else {
			x %= MOD;
			matrix = matrixexpo(k, matrix);
			long low = (x * matrix[0][0] + matrix[0][1]) % MOD;
			long hi = x * mathpow(k, 2) % MOD;
			System.out.println((low + hi) % MOD);
		}
	}
}