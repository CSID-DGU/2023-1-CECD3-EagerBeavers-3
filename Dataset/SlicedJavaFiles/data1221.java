public class Main{	public static void main(String [] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
	    long n = in.nextInt();
		long m = in.nextInt();
		long k = in.nextInt();

		long w = n-m;

		long c = w*k;
		if(c >= n)
		{
			System.out.println(m);
			return;
		}

		long rem = n-c;
		long h = rem/k;

		long p = power(2, h+1);
		p -= 2;
		p += MOD;
		p %= MOD;
		p *= k;
		p %= MOD;

		long point = p + m - (h*k) % MOD;
		point += MOD;
		point %= MOD;

		System.out.println(point);



	}
}