public class Main{	public static void main(String args[]) throws IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println(f(1,100,30));
		String S[]=br.readLine().split(" ");
		int N=Integer.parseInt(S[0]);
		int x=Integer.parseInt(S[1]);
		int y=Integer.parseInt(S[2]);
		int c=Integer.parseInt(S[3]);
		int lo=0;
		//System.out.println(Long.MAX_VALUE);
		int hi=1000000000;
		while(hi-lo>=10)
			{
			int steps=(hi+lo)/2;
			//System.out.println("checking "+steps+" hi= "+hi+" lo = "+lo);
			long total=f(x,y,steps)+f(N-x+1,y,steps)+f(N-x+1,N-y+1,steps)+f(x,N-y+1,steps);
			//System.out.println(f(x,y,steps)+" "+f(N-x+1,y,steps)+" "+f(N-x+1,N-y+1,steps)+" "+f(x,N-y+1,steps));
			total-=3;			//x,y
			total-=Math.min(steps,x-1);			//left
			total-=Math.min(steps,y-1);			//down
			total-=Math.min(steps,N-x);			//right
			total-=Math.min(steps,N-y);			//up
			//System.out.println("total = "+total);
			if(total>=c)
				hi=steps+1;
			else
				lo=steps-1;
			}
		for(int steps=lo;steps<=hi;steps++)
			{
			//System.out.println("checking "+steps);
			long total=f(x,y,steps)+f(N-x+1,y,steps)+f(N-x+1,N-y+1,steps)+f(x,N-y+1,steps);
			total-=3;			//x,y
			total-=Math.min(steps,x-1);			//left
			total-=Math.min(steps,y-1);			//down
			total-=Math.min(steps,N-x);			//right
			total-=Math.min(steps,N-y);			//up
			//System.out.println("total = "+total);
			if(total>=c)
				{
				System.out.println(steps);
				return;
				}
			}
		}
}