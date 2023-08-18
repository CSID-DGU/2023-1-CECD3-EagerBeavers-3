public class Main{	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in) ;
		int n = in.nextInt() ;
		boolean[] lst = new boolean[n] ;
		for(int i=0;i<n;i++)
		{
			lst[i] = (in.next().equals("s"))?false:true ;
		}
		System.out.println(dp(lst)) ;
	}
}