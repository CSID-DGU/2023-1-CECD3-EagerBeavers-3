public class Main{	public static void main(String[] args)
	{
		InputReader in = new InputReader(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		long x = in.nextLong();
		long k = in.nextLong();
		
		if(x==0)
			pw.println(0);
		else
		{
			long mul = modularExponentiation(2L, k, mod);
			x = (x%mod * 2L%mod)%mod;
			x = (x%mod - 1L%mod + mod)%mod;
			x = (x%mod * mul%mod)%mod;
			x = (x%mod + 1%mod)%mod; 
			pw.print(x);
		}
		pw.flush();
		pw.close();
	}
}