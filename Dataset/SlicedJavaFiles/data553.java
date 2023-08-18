public class Main{	public static void main (String[] args) throws IOException
	{
		final long mod=(long) (1e9+7);  
		Reader s=new Reader();
		  PrintWriter pt=new PrintWriter(System.out);
		  
//		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  int T=s.nextInt();
//		  int T=Integer.parseInt(br.readLine());
//		  int T=1;
		  while(T-->0)
		  {
		        long n=s.nextInt();
		        long sq1=n/2;
		        
		        long sq2=n/4;
		        
		        if(isPerfectSquare(sq1)&&sq1*2==n||isPerfectSquare(sq2)&&sq2*4==n)
		        	pt.println("YES");
		        else
		        	pt.println("NO");
		        
		        
		        
		  }
		  pt.close();
	}
}