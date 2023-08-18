public class Main{	public static void main(String[] args)
	{
		long x=nl(),k=nl();
		if(x==0)
		{
			pr(0);
			exit();
		}
		x%=mod;
		pr((((x*powm(2,k+1,mod))%mod-powm(2,k,mod)+1)%mod+mod)%mod);
		System.out.print(output);
	}
}