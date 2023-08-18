public class Main{    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();
        int k = input.nextInt();
        hor = new int[n][m - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - 1; j++) {
                hor[i][j] = input.nextInt();
            }
        }
        ver = new int[n - 1][m];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                ver[i][j] = input.nextInt();
            }
        }
        if (k % 2 != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(-1 + " ");
                }
                System.out.println("");
            } 
        } else {
            dp = new long[n][m][k + 1];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    for (int x = 0; x <= k; x++) {
                        dp[i][j][x] = Long.MAX_VALUE;
                    }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    minCost(i, j, k);
                    System.out.print(dp[i][j][k] + " ");
                }
                System.out.println("");
            }
        }
        
        input.close();
    }
}