public class Main{    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int[][] distRow = new int[N][N];
        int[][] distTop = new int[N][N];
//        for(int i = 0; i < N; i++) {
//            Arrays.fill(distTop, Integer.MAX_VALUE);
//            Arrays.fill(distRow, Integer.MAX_VALUE);
//        }
        //compute row distances
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                int curMin = Integer.MAX_VALUE;
                for(int k = 0; k < M; k++) {
                    curMin = Math.min(curMin, Math.abs(arr[i][k] - arr[j][k]));
                }
                distRow[i][j] = distRow[j][i] = curMin;
            }
        }
        //compute bottom/top distances
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int curMin = Integer.MAX_VALUE;
                for(int k = 0; k+1 < M; k++) {
                    curMin = Math.min(curMin, Math.abs(arr[i][k] - arr[j][k+1]));
                }
                distTop[i][j] = curMin;
            }
        }
        int maxMask = 1 << N;
        int[][][] dp = new int[maxMask][N][N];
        for(int i = 0; i < maxMask; i++) {
            for(int j = 0; j < N; j++) {
                Arrays.fill(dp[i][j], Integer.MAX_VALUE);
            }
        }
        for(int mask = 1; mask < maxMask; mask++) {
            for (int j = 0; j < N; j++) {
                if ((mask & ( 1 << j)) == 0) continue;
                for(int k = 0; k < N; k++) {
                    if ((mask &(1 << k)) == 0) continue;
                    if (j == k && mask - (1 << k) != 0) continue;
                    for (int i = 0; i < N; i++) {
                        if ((mask & (1 << i)) > 0) continue;
                        int curMask = mask | (1 << i);
                        if (dp[curMask][i][k] != Integer.MAX_VALUE)
                            dp[curMask][i][k] = Math.max(dp[curMask][i][k], Math.min(dp[mask][j][k], distRow[i][j]));
                        else
                            dp[curMask][i][k] = Math.min(dp[mask][j][k], distRow[i][j]);
                    }
                }
            }
        }
        maxMask--;
        int max = 0;
        for(int i= 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if (i==j && N != 1) continue;
                max = Math.max(max, Math.min(dp[maxMask][i][j], distTop[i][j]));
            }
        }
        System.out.println(max);
    }
}