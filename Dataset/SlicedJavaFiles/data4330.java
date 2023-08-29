public class Main{    public static void main(String[] args) throws Exception{           	
    	InputReader in = new InputReader(System.in);       
    	PrintWriter pw=new PrintWriter(System.out);   
    	
    	
    	//int t=in.readInt();
        //while(t-->0)
        //{
    	
        int n=in.readInt();
        int m=in.readInt();
        boolean v[][]=new boolean[n][n];
        for(int i=0;i<m;i++)
        {
        	int x=in.readInt()-1;
        	int y=in.readInt()-1;
        	v[x][y]=true;
        	v[y][x]=true;
        }
    	
       long dp[][]=new long[1<<n][n];
       for(int i=0;i<n;i++)
       {
    	   dp[1<<i][i]=1;
       }
       long ans=0;
    	for(int mask=1;mask<(1<<n);mask++)
    	{
    		int s=-1;
    		for(int i=0;i<n;i++)
    		{
    			if((mask&(1<<i))!=0)
    			{
    				s=i;
    				break;
    			}
    		}
    		for(int i=0;i<n;i++)
    		{
    			if(i!=s&&((1<<i)&mask)!=0)
    			{
    				for(int j=0;j<n;j++)
    				{
    					if((1<<j)!=0&&i!=j&&v[i][j])
    					{
    						int rem=(1<<i)^mask;
    						dp[mask][i]+=dp[rem][j];
    					}
    				}    			
    		
    				int c=Integer.bitCount(mask);
    				if(c>=3&&v[i][s])
    				{
    					ans+=dp[mask][i];
    				}
    			}
    		}
    	}
    	ans/=2;
		pw.println(ans);	     	
    	
    	//}
    	
    	pw.close();
    }
}