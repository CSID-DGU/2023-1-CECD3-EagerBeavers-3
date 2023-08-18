public class Main{	  public static void main(String[] args)  throws IOException
{
		    //CHECK FOR N=1
       	//CHECK FOR N=1
	    //CHECK FOR N=1			
       	//CHECK FOR N=1
		  
		  
		  
		   PrintWriter out=new PrintWriter(System.out);
		  // StringBuffer sb=new StringBuffer("");
		  int ttt=1;
		//  ttt =i(); 	
		   
	        outer :while (ttt-- > 0) 
			{

	        	int n=i();
	        	int m=i();
	        	int k=i();
	        	int A[][]=input(n,m-1);
	        	int B[][]=input(n-1, m);
	        	dp=new long[n+1][m+1][k+1];
	        	for(int ii=0;ii<n;ii++) {
	        		for(int jj=0;jj<m;jj++) {
	        			Arrays.fill(dp[ii][jj],-1);
	        		}
	        	}
	        	if(k%2!=0) {
	        		for(int i=0;i<n;i++) {
	        			for(int j=0;j<m;j++) {
	        				System.out.print("-1 ");
	        			}
	        			System.out.println();
	        		}
	        	}
	        	else {
	        	go(A, B, 0, 0, k/2, n, m);
	        	for(int i=0;i<n;i++) {
        			for(int j=0;j<m;j++) {
        				System.out.print(dp[i][j][k/2]*2+" ");
        			}
        			System.out.println();
        		}
	        	}
	        	
			}
		     out.close();
    	//System.out.println(sb.toString());
	     
	     
	    //CHECK FOR N=1                    //CHECK FOR M=0
        //CHECK FOR N=1                    //CHECK FOR M=0
       	//CHECK FOR N=1
       	//CHECK FOR N=1
       	//CHECK FOR N=1
		        	
    }
}