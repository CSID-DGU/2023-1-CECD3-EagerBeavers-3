public class Main{    public static void main(String[] args) {
        setupCombo(301);
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        long[] a = new long[N];
        HashMap<Long, Integer> clusters = new HashMap<>();
        for (int i = 0; i < N; i++) {
            a[i] = removeSquares(sc.nextLong());
            clusters.merge(a[i], 1, Integer::sum);
        }
        int G = clusters.size();
        int[] groups = new int[G + 1];
        int ptr = 1;
        for (int amt : clusters.values()) {
            groups[ptr++] = amt;
        }
        long[][] dp = new long[G + 1][N + 1];
        // dp[g][bad] = ways to interleave first g groups for a given # of bad pairs
        dp[0][0] = 1;
        // dp[0][k] = 0, k != 0
        int total = 0;
        /*
        intuition for runtime analysis:
        Say there were k groups, each size n / k

        The outer loop is k, 2nd loop is n worst case,
        and the inner 2 are bounded by n / k (amt per group)
        k * n * (n / k) * (n / k) = n^3 / k, which works despite 4 loops!!

        Seems hard to convert into pull-dp since prevBad has a more direct
        meaning in the arrangements, so using that as our variable makes more sense
         */
        for (int prefix = 1; prefix <= G; prefix++) {
            int amt = groups[prefix];
            // key bugs here and there: USE THE CORRECT BOUNDS
            for (int prevBad = 0; prevBad <= max(0, total - 1); prevBad++) {
                for (int fixed = 0; fixed <= min(prevBad, amt); fixed++) {
                    for (int slots = max(1, fixed); slots <= min(amt, total + 1); slots++) {
                        int introduced = amt - slots;
                        long ways = mult(
                                choose[prevBad][fixed],
                                choose[total + 1 - prevBad][slots - fixed],
                                choose[amt - 1][slots - 1],
                                fact[amt],
                                dp[prefix - 1][prevBad] // key bug: NEED TO RELATE PREVIOUS DP
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