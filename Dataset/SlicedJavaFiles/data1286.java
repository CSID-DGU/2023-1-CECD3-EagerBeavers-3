public class Main{	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long k = scan.nextLong();
		long v = 1000000007L;
		if(x>0){
			long p = ((2*x)-1)%v;
			long a = ans(2L,k,v);
			long b = (p*a)%v;
			System.out.println((b+1)%v);
		}
		else{
			System.out.println(0);
		}
	}
}