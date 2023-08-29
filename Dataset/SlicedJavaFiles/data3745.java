public class Main{    public static void main(String[] args) {
        setupCombo(301);
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int N = sc.nextInt();
        long[] a = sc.nextLongs(N);
        boolean[] vis = new boolean[N];
        int[] groups = new int[N + 1];
        int G = 0;
        for (int i = 0; i < N; i++) {
            if (!vis[i]) {
                vis[i] = true;
                int elems = 1;
                for (int j = i + 1; j < N; j++) {
                    long prod = a[i] * a[j];
                    long root = (long) Math.sqrt(prod);
                    if (!vis[j] && prod == root * root) {
                        vis[j] = true;
                        elems++;
                    }
                }
                groups[++G] = elems;
            }
        }

        long[][] dp = new long[G + 1][N + 1];
        // dp[g][bad] = ways to interleave first g groups for a given # of bad pairs
        dp[0][0] = 1;
        // dp[0][k] = 0, k != 0
        int total = 0;
        for (int prefix = 1; prefix <= G; prefix++) {
            int amt = groups[prefix];
            for (int prevBad = 0; prevBad <= max(0, total - 1); prevBad++) {
                for (int fixed = 0; fixed <= min(prevBad, amt); fixed++) {
                    for (int slots = max(1, fixed); slots <= min(amt, total + 1); slots++) {
                        int introduced = amt - slots;
                        long ways = mult(
                                choose[prevBad][fixed],
                                choose[total + 1 - prevBad][slots - fixed],
                                choose[amt - 1][slots - 1],
                                fact[amt],
                                dp[prefix - 1][prevBad]
                        );
                        int currBad = prevBad + introduced - fixed;
                        dp[prefix][currBad] = (dp[prefix][currBad] + ways) % mod;
                    }
                }
            }
            total += amt;
//            System.out.println(Arrays.toString(dp[prefix]));
        }
        out.println(dp[G][0]);
        out.close();
    }
}