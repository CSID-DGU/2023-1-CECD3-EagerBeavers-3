public class Main{    public static void main(String[] args) throws IOException {
        Soumit sc = new Soumit();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        if(k%2==1){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    sb.append("-1 ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }

        k/=2;

        long[][] horizontaledge = new long[n][m-1];
        long[][] verticaledge = new long[n-1][m];
        for(int i=0;i<n;i++)
            horizontaledge[i] = sc.nextLongArray(m-1);
        for(int i=0;i<n-1;i++)
            verticaledge[i] = sc.nextLongArray(m);

        long[][][] dp = new long[11][n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[0][i][j] = 0;
            }
        }
        for(int i=1;i<=k;i++){
            for(int j1=0;j1<n;j1++){
                for(int j2=0;j2<m;j2++){
                    long min = Long.MAX_VALUE/2000;
                    //for up
                    if(isValid(n, m, j1-1, j2)){
                        min = Math.min(dp[i-1][j1-1][j2]+verticaledge[j1-1][j2], min);
                    }

                    //for down
                    if(isValid(n, m, j1+1, j2)){
                        min = Math.min(min, dp[i-1][j1+1][j2]+verticaledge[j1][j2]);
                    }

                    //for left
                    if(isValid(n, m, j1, j2-1)){
                        min = Math.min(min, dp[i-1][j1][j2-1]+horizontaledge[j1][j2-1]);
                    }

                    //for right
                    if(isValid(n, m, j1, j2+1)){
                        min = Math.min(min, dp[i-1][j1][j2+1]+horizontaledge[j1][j2]);
                    }

                    dp[i][j1][j2] = min;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sb.append(dp[k][i][j]*2).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        sc.close();
    }
}