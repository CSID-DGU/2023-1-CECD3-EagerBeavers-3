public class Main{    public static void main(String[] args) throws Exception
    {
    	FastReader in=new FastReader();
    	PrintWriter pw=new PrintWriter(System.out);
    	int n=in.nextInt();
    	long ans=0;
    	for(int i=2;2*i<=n;i++)
    	{
    		ans+=i*(n/i-1);
    	}
    	ans*=4;
    	pw.print(ans);
    	pw.flush();
    }
}