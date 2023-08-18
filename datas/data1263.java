public class Main{	public static void main(String[] args) {
		JS scan = new JS();
		long n = scan.nextLong();
		long k = scan.nextLong();
		if(n == 0) {
			System.out.println(0);
			return;
		}
		if(k == 0) {
			long ans = (n%m)*(2%m)%m;
			System.out.println(ans%m);
			return;
		}
		//System.out.println(2+" "+(k+1)+" "+m);
		long coeff = power(2L, k+1, m);
		//System.out.println(coeff);
		long r = (coeff%m)*(n%m)%m;
		//System.out.println(r);
		long x = power(2L, k, m)%m-1;
		if(x < 0) x += m;
		long ans = r-x;
		if(ans < 0) ans += m;
		System.out.println(ans%m);
	}
}