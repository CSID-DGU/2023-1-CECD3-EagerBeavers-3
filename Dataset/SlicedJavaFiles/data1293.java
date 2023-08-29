public class Main{	public static void main(String[] args) throws IOException 
	{
//	System.out.println(power(2,9,1000000007));
	long x=l();
	long k=l();
if(x!=0)
{
	long f=x%1000000007;
	long s=(f*power(2,k+1,1000000007))%1000000007;
	//out.println(s);
	long e=	(power(2,k,1000000007)-1)%1000000007;
	//out.println(e);
	long ans=(s-e+1000000007)%1000000007;
	
	out.println(ans);
	
}
else
{
	out.println(0);
}
	out.close();
	}
}