public class Main{    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        PrintWriter pr = new PrintWriter(System.out);
//        int T=fs.nextInt();
//        for (int tt=1; tt<=T; tt++) {
            int n = fs.nextInt(), m = fs.nextInt(), k = fs.nextInt();
            int[][] right = new int[n][m -1], down = new int[n - 1][m];
            for(int i = 0; i < n; i++) right[i] = fs.readArray(m - 1);
            for(int i = 0; i < n - 1; i++) down[i] = fs.readArray(m);
            if (k % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) pr.print(-1 + " ");
                    pr.println();
                }
            } else {
                int[][][] dp = new int[k / 2 + 1][n][m];

                for(int r = 1; 2 * r <= k; r++) {
                    for(int i = 0; i < n; i++) Arrays.fill(dp[r][i], INF);
                    for(int i = 0; i < n; i++)
                        for(int j = 0; j  + 1 < m; j++) {
                            int cost = right[i][j];
                            dp[r][i][j] = Integer.min(dp[r][i][j], dp[r - 1][i][j + 1] + cost);
                            dp[r][i][j + 1] = Integer.min(dp[r][i][j + 1], dp[r - 1][i][j] + cost);
                        }
                    for(int i = 0; i + 1 < n; i++)
                        for(int j = 0; j < m; j++) {
                            int cost = down[i][j];
                            dp[r][i][j] = Integer.min(dp[r][i][j], dp[r - 1][i + 1][j] + cost);
                            dp[r][i + 1][j] = Integer.min(dp[r][i + 1][j], dp[r - 1][i][j] + cost);
                        }
                }
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < m; j++) {
                        pr.print(2 * dp[k/2][i][j] + " ");
                    }
                    pr.println();
                }
            }


//        }

        pr.flush();
        pr.close();
    }
}