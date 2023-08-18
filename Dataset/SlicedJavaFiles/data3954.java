public class Main{    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n = scanner.nextInt();
        double k = scanner.nextInt();
        long[] graph = new long[n];
        for(Integer i = 0; i < n; i++) {
            for(Integer j =0; j < n; j++) {
                Integer val = scanner.nextInt();
                if (val.equals(1) || i.equals(j)) {
				 graph[i] |= 1L << j;
				}
            }
        }

        int szLeft = n/2;
        int szRight = n - szLeft;

        int[] dp = new int[1 << szLeft];
        int maxMask = 1 << szLeft;

        for(int mask = 1; mask <maxMask; mask++) {
            int curMask = mask;

            for(int j = 0; j < szLeft; j++) {
                if (((1 << j) & mask) > 0) {
                    curMask &= graph[j + szRight] >> szRight;
                    dp[mask] = Math.max(dp[mask], dp[mask ^ (1 << j)]);
                }
            }
            if (mask == curMask) {
                dp[mask] = Math.max(dp[mask],Integer.bitCount(mask));
            }
        }
        int ans = 0;
        int rmaxMask = 1 << szRight;
        for(int mask = 0; mask < rmaxMask; mask++) {
            int curMask = mask;
            int oMask = maxMask -1;
            for(int j = 0; j < szRight; j++) {
                if (((1 << j) & mask) > 0) {
                    curMask &= (graph[j] & (rmaxMask-1));
                    oMask &= graph[j] >> szRight;
                }
            }
            if (curMask != mask) continue;
            ans = Math.max(ans, Integer.bitCount(mask) + dp[oMask]);
        }
        k/=ans;
        out.println(k * k * (ans * (ans-1))/2);
        out.flush();
    }
}