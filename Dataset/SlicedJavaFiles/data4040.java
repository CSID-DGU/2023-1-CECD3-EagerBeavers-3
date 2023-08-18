public class Main{    public static void main(String[] args) {
        scanner = new FastScanner();
        int n = scanner.nextInt();
        int T = scanner.nextInt();

        int[][] songs = new int[n][2];
        for (int i = 0; i < n; i++) {
            songs[i][0] = scanner.nextInt();
            songs[i][1] = scanner.nextInt() - 1;
        }

        int[] mapping = new int[65536];
        int mask = 1;
        for (int k = 0; k < n; k++) {
            for (int i = 1; i < mapping.length; i++) {
                if ((i & mask) != 0) mapping[i] += songs[k][0];
            }
            mask <<= 1;
        }

        int[][][] dp = new int[17][65536][3];
        mask = 1;

        for (int i = 0; i < n; i++) {
            dp[1][mask][songs[i][1]] = 1;
            mask <<= 1;
        }

        for (int i = 1; i < n; i++) {
            mask = 1;
            for (int k = 0; k < n; k++) {
                int cg = songs[k][1];

                int g1,g2;
                if (cg == 0) {g1 = 1; g2 = 2;}
                else if (cg == 1) {g1 = 0; g2 = 2;}
                else {g1 = 0; g2 = 1;}

                for (int j = 1; j < 65536; j++) {
                    if ((j & mask) != 0) continue;
                    dp[i + 1][j | mask][cg] = (dp[i + 1][j | mask][cg] + (dp[i][j][g1] + dp[i][j][g2]) % mod) % mod;
                }
                mask <<= 1;
            }
        }
        int res = 0;
        for (int k = 0; k < 17; k++)
        for (int i = 1; i < 65536; i++) {
            if (mapping[i] == T) res = (res + dp[k][i][0] + dp[k][i][1] + dp[k][i][2]) % mod;
        }
        System.out.println(res);
    }
}