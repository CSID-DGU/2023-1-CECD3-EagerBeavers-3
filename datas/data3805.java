public class Main{public static void main (String[] args)
{
	MyScanner s =  new MyScanner();
     
    int n = s.nextInt();
    int m = s.nextInt();
    int k = s.nextInt();
    
    int[][] h = new int[n][m-1];
    
    for(int i = 0; i<n; i++)
    {
    	for(int j = 0; j<m-1; j++)
    	{
    		h[i][j] = s.nextInt();
    	}
    }
    
    int[][] v = new int[n-1][m];
    
    for(int i = 0; i<n-1; i++)
    {
    	for(int j = 0; j<m; j++)
    	{
    		v[i][j] = s.nextInt();
    	}
    }
    
    
   solution(n,m,k,h,v);
    
    out.flush();
    out.close();
    
}
}