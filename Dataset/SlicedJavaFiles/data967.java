public class Main{	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc=new FastReader();
		long n=sc.L();
		long k=sc.L();
		long x=8*(n+k);
		x+=9;
		x=(long)Math.sqrt(x)-3;
		x/=2;
		
		System.out.println(n-x);
	 }
}