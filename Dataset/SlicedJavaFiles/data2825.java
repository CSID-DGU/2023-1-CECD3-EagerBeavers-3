public class Main{	public static void main(String args[]) throws Exception
	{
		int t=sc.nextInt();
		while(t>0)
		{
			long a=sc.nextLong(),b=sc.nextLong();
			out.println(solve(a,b));
			t--;
		}
		out.close();
	}
}