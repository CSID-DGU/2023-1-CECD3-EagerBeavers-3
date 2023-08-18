public class Main{    public static void main(String[] args) throws IOException {
        int n=r.nextInt();
        int m=r.nextInt();
        int k=r.nextInt();
        int [][]hor=new int[n][m-1];
        int [][]ver=new int[n-1][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m-1;++j) hor[i][j]=r.nextInt();
        }
        for(int i=0;i<n-1;++i){
            for(int j=0;j<m;++j) ver[i][j]=r.nextInt();
        }
        int [][]dp=new int[n][m];
        if(k%2!=0){
            for(int i=0;i<n;++i){
                for(int j=0;j<m;++j) dp[i][j]=-1;
            }
        }
        else{
            int [][]new_dp=new int[n][m];
            for(int step=0;step<k/2;++step){
                for(int i=0;i<n;++i){
                    for(int j=0;j<m;++j){
                        new_dp[i][j]=INF;
                        if(i>0){
                            new_dp[i][j]=Math.min(new_dp[i][j],dp[i-1][j]+ver[i-1][j]*2);
                        }
                        if(i<n-1){
                            new_dp[i][j]=Math.min(new_dp[i][j],dp[i+1][j]+ver[i][j]*2);
                        }
                        if(j>0){
                            new_dp[i][j]=Math.min(new_dp[i][j],dp[i][j-1]+hor[i][j-1]*2);
                        }
                        if(j<m-1){
                            new_dp[i][j]=Math.min(new_dp[i][j],dp[i][j+1]+hor[i][j]*2);
                        }
                    }
                }
                for(int i=0;i<n;++i){
                    for(int j=0;j<m;++j){
                        dp[i][j]=new_dp[i][j];
                    }
                }
            }
        }
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                pw.print(dp[i][j]+" ");
            }
            pw.println();
        }
        pw.close();
    }
}