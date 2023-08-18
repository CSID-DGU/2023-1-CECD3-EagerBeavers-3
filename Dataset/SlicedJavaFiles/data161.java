public class Main{	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		long x=in.nextLong();
		long k=in.nextLong();
		
		long mod=1000000007;
		long get=power(2,k,mod);
		long ans=((get%mod)*((2*x)%mod))%mod-get+1;
		if(ans<0)
		ans+=mod;
		if(x==0)
		ans=0;
		System.out.println(ans);
		
	}
}