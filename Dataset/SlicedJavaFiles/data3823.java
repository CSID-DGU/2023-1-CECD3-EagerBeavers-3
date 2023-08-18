public class Main{    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        n = fs.nextInt();
        m =fs.nextInt();
        k = fs.nextInt();
        rows = new int[n][m-1];
        cols = new int[n-1][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m-1; j++){
                rows[i][j] = fs.nextInt();
            }
        }
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < m; j++){
                cols[i][j] = fs.nextInt();
            }
        }
        int [][][] res = new int[100][n][m];
        for(int o = 2; o <= k; o+=2){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    res[o][i][j] = 0x3f3f3f3f;
                    if(i>0){
                        res[o][i][j] = Math.min(res[o][i][j], res[o-2][i-1][j] + 2*cols[i-1][j]);
                    }
                    if(i+1<n){
                        res[o][i][j] = Math.min(res[o][i][j], res[o-2][i+1][j] + 2 * cols[i][j]);
                    }
                    if(j>0){
                        res[o][i][j] = Math.min(res[o][i][j], res[o-2][i][j-1] + 2 * rows[i][j-1]);
                    }
                    if(j+1<m){
                        res[o][i][j] = Math.min(res[o][i][j], res[o-2][i][j+1] + 2 * rows[i][j]);
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m;j ++){
                if(k%2==1){
                    System.out.print(-1+" ");
                }else{
                    System.out.print(res[k][i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}