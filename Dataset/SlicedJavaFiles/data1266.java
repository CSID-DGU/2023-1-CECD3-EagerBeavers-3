public class Main{	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long k = scan.nextLong();
		if(x == 0)
		{
			System.out.println(0);
			return;
		}
		x = x%mod;
		long power = pow(2,k + 1)%mod;
		power = (power*x)%mod;
		long num = (pow(2,k) - 1 + mod)%mod;
		long ans = (power - num + mod)%mod;
		System.out.println((ans));
	}
}