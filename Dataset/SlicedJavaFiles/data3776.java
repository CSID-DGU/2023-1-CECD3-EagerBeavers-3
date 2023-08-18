public class Main{    public static void main(String[] args){
        FastScanner in = new FastScanner();
        FastWriter out = new FastWriter();
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        int[][] right=new int[n][m-1];
        int[][] down=new int[n-1][m];
        for (int i = 0; i < n; i++) {
            right[i]=in.nextArray(m-1);
        }
        for (int i = 0; i < n - 1; i++) {
            down[i]=in.nextArray(m);
        }
        if(k%2!=0){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    out.print("-1 ");
                }
                out.println();
            }
        }else {
            int[][] dp=new int[n][m];
            int[][] dp1=new int[n][m];
            for (int i = 0; i < k / 2; i++) {
                for (int j = 0; j < n; j++) {
                    for (int l = 0; l < m; l++) {
                        int ans=Integer.MAX_VALUE;
                        if(j>0){
                            ans=Math.min(ans,dp[j-1][l]+down[j-1][l]);
                        }
                        if(l>0){
                            ans=Math.min(ans,dp[j][l-1]+right[j][l-1]);
                        }
                        if(j!=n-1){
                            ans=Math.min(ans,dp[j+1][l]+down[j][l]);
                        }
                        if(l!=m-1){
                            ans=Math.min(ans,dp[j][l+1]+right[j][l]);
                        }
                        dp1[j][l]=ans;
                    }
                }
                dp=dp1;
                dp1=new int[n][m];
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    out.println((2*dp[i][j])+" ");
                }
                out.println();
            }
        }
        out.close();
    }
}