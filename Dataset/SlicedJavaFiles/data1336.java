public class Main{	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		long x=scan.nextLong();
		long k=scan.nextLong();
		long MOD=1000000007;
		if(x==0){System.out.println(0);return;}
		x %= MOD;
		long a=pow(2L,k+1);
		long b=pow(2L,k);
		long res=(a*x)%MOD-b+1;
		if(res<0){res+=MOD;}
		System.out.println(res%MOD);
	}
}