public class Main{	public static void main(String[] args)
	{
		FastReader reader = new FastReader();
		PrintWriter writer = new PrintWriter(System.out);

		long n = reader.nextLong();
		long k = reader.nextLong();

		long s=0;
		long e=n;

		long ans = -1;
		while (s<=e) {
			long m = (s+e)/2;
			long temp = ((n-m)*(n-m+1))/2 - m;

			if (temp < k) 
				e = m-1;
			else if (temp > k)
				s = m+1;
			else {
				ans = m;
				break;
			} 
		}

		writer.println(ans);
		writer.close();
	}
}