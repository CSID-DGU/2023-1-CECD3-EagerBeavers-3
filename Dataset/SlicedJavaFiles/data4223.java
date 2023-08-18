public class Main{    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] cols = new int[m][n];
            for(int i = 0; i < n; i++) {
                for(int j =0; j < m; j++) {
                    cols[j][i] = scanner.nextInt();
                }
            }
            int maxMask = 1 << n;
            int[] dp = new int[maxMask];
            Arrays.fill(dp, -1);
            dp[0] = 0;
            for(int i = 0; i < m; i++) {
                for(int mask = maxMask-1; mask>=0; mask--) {
                    int[] arr = cols[i].clone();
                    for(int j = 0; j < n; j++) {
                        for(int smask = mask; smask >= 0; smask = (smask-1)&mask) {
                            if (dp[smask] == -1) continue;
                            int add = 0;
                            for(int k = 0; k < n; k++) {
                                if (((mask^smask)&(1 << k)) > 0) add += arr[k];
                            }
                            dp[mask] = Math.max(dp[mask], dp[smask] + add);
                            if (smask == 0) break;
                        }
                        arr = shift(arr);
                    }
                }
            }
            out.println(dp[maxMask-1]);
        }
        out.flush();
    }
}