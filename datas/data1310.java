public class Main{	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long k=sc.nextLong();
		long mod=1000000007;
		if(k==0 || x==0)
			System.out.println((2*x)%mod);
		else
		{	long answer=1;
			answer+=(power(2,k,mod))*(((2*x)-1)%mod);
			System.out.println(answer%mod);
		}
	}
}