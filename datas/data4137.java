public class Main{	public static void main(String[] args) 
	{

		x=in.nextInt();
		y=in.nextInt();
		n=in.nextInt();
		xx=new int[n];
		yy=new int[n];
		dp=new int[1<<n];
		for(int i=0;i<n;i++)
		{
			xx[i]=in.nextInt();
			yy[i]=in.nextInt();
		}
		dist=new int[n];
		g=new int[n][n];
		for(int i=0;i<n;i++)
		{
			dist[i]=square(abs(xx[i]-x))+square(abs(yy[i]-y));
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				g[i][j]=square(abs(xx[i]-xx[j]))+square(yy[i]-yy[j]);
				//System.out.println("i "+i+" j "+j+" "+g[i][j]);
			}
		}
		Arrays.fill(dp, Integer.MAX_VALUE/2);
		dp[0]=0;
		for(int i=0;i<(1<<n);i++)
		{
			//we have to find dp[i]
			for(int j=0;j<n;j++)
			{
				if((i&(1<<j))>0)   //not visited j
				continue;
				dp[i|(1<<j)]=min(dp[i|(1<<j)], dp[i]+2*dist[j]);
				for(int k=j+1;k<n;k++)
				{
					if((i&(1<<k))>0)
						continue;
					dp[i|(1<<j)|(1<<k)]=min(dp[i|(1<<j)|(1<<k)], dp[i]+dist[j]+dist[k]+g[j][k]);
				}
				break;
			}
		}	
		out.println(dp[(1<<n)-1]);
		Stack<Integer> stack=new Stack<>();
		stack.push(0);
		int i=(1<<n)-1;
		while(i>0)
		{
			boolean tocontinue=false;
			for(int a=0;a<n;a++)
			{
				if((i&(1<<a))==0)
					continue;
				if(dp[i]==(dp[i^(1<<a)]+2*dist[a]))
				{
					stack.push(a+1);
					stack.push(0);
					i-=(1<<a);
					tocontinue=true;
				}
				if(tocontinue)
					continue;
				for(int b=a+1;b<n;b++)
				{
					if((i & (1<<b)) == 0) continue;
					if(dp[i]==(dp[i^(1<<a)^(1<<b)]+dist[a]+dist[b]+g[a][b]))
					{
						i-=(1<<a);
						i-=(1<<b);
						stack.push(a+1);
						stack.push(b+1);
						stack.push(0);
						tocontinue=true;
					}
					if(tocontinue)
						break;
				}
				if(tocontinue)
					break;
			}
			
		}
		for(int ii : stack)
			out.print(ii+" ");
		out.close();

	}
}