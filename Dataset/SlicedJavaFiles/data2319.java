public class Main{    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt();char[] a=new char[n+1];a[0]='s';
		
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		
		int[][] dp=new int[n+1][maxn],sum=new int[n+1][maxn];dp[0][0]=1;
		
		sum[0][0]=1;
		
		for(int i=1;i<maxn;i++)
		{
			sum[0][i]=add(sum[0][i],sum[0][i-1]);
		}
		
		for(int i=1;i<=n;i++)
		{
			if(a[i]=='f')
			{
				continue;
			}
			
			int curr=0,idx=0;
			
			for(int j=i-1;j>=0;j--)
			{
				if(a[j]=='s')
				{
					idx=j;break;
				}
				
				else
				{
					curr++;
				}
			}
			
			for(int j=0;j<maxn;j++)
			{
				int up=Math.max(0,j-curr);
					
				long now=(sum[idx][maxn-1]-(up==0?0:sum[idx][up-1]));
							  
				now=add(now,mod);
					
				dp[i][j]=add(dp[i][j],now);
			}
			
			sum[i][0]=dp[i][0];
			
			for(int j=1;j<maxn;j++)
			{
				sum[i][j]=add(dp[i][j],sum[i][j-1]);
			}
		}
		
		//out.println(dp[2][0]+" "+dp[2][1]+" "+dp[2][2]);
		
		out.println(dp[n][0]);out.close();
    }
}