public class Main{	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long x = s.nextLong(), k = s.nextLong() + 1, mod = (long)Math.pow(10, 9) + 7;
		long ans;
		if(x == 0){
			System.out.println(0);
			return;
		}
//		if(x != 0){
			ans = ((power(2, k % (mod - 1), mod) % mod) * (x % mod)) % mod; 
	/*	}else{
			ans = 0;
		}
		*/ans = (ans - power(2, (k - 1) % (mod - 1), mod) % mod + 2 * mod) % mod;
		System.out.println((ans + 1) % mod);

	}
}