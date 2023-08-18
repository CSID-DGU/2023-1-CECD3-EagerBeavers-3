public class Main{    public static void main (String[] args) throws java.lang.Exception {
    	int test=1;
    	//test=sc.nextInt();
    	while(test-->0) {
    		n=sc.nextInt();m=sc.nextInt();
    		int k=sc.nextInt();
    		if(k%2!=0) {
    			for(int i=0;i<n;i++) {
    				for(int j=0;j<m;j++) out.print(-1+" ");
    				out.println();
    			}
    			continue;
    		}
    		hor=new int[n][m-1];
    		ver=new int[n-1][m];
    		for(int i=0;i<n;i++) {
    			for(int j=0;j<m-1;j++) {
    				hor[i][j]=sc.nextInt();
    			}
    		}
    		for(int i=0;i<n-1;i++) {
    			for(int j=0;j<m;j++) {
    				ver[i][j]=sc.nextInt();
    			}
    		}
    		dp=new int[n][m][k+1];
    		for(int i=0;i<n;i++) {
    			for(int j=0;j<m;j++) {
    				out.print(solve(i,j,k)+" ");
    			}
    			out.println();
    		}
    		
    	}
        out.flush();
        out.close();
    }
}