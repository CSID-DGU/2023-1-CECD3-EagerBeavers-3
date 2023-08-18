public class Main{	public static void main(String[] args)
	{
		FastReader fr =new FastReader();

		PrintWriter op =new PrintWriter(System.out);

		long n =fr.nextLong() ,k =fr.nextLong() ,d =(long)Math.sqrt(9l+8l*(n+k)) ;

		d -= 3l ;	d /=2l ;op.println(n-d) ;

		op.flush();	op.close();
	}
}