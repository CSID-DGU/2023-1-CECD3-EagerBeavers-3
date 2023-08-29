public class Main{    public static void main(String[] args) {
//        generate();
        int T = sc.nextInt();
        int MAX = (int) 1e7;
        int[] canonical = new int[MAX + 1];
        canonical[1] = 1;
        for (int factor = 2; factor <= MAX; factor++) {
            if (canonical[factor] == 0) {
                for (int mult = factor; mult <= MAX; mult += factor) {
                    int prev = canonical[mult / factor];
                    if (prev % factor == 0) {
                        canonical[mult] = prev / factor;
                    } else {
                        canonical[mult] = prev * factor;
                    }
                }
            }
        }
        int[] last = new int[MAX + 1];
        while (T-->0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] a = new int[N + 1];
            int[][] dp = new int[2][K + 1];
            int[][] start = new int[2][K + 1];
            int ptr = 0;
            for (int i = 1; i <= N; i++) {
                int nxt = 1 ^ ptr;
                a[i] = canonical[sc.nextInt()];
                for (int k = 0; k <= K; k++) {
                    if (start[ptr][k] > last[a[i]]) {
                        // extend it for free (unique)
                        dp[nxt][k] = dp[ptr][k];
                        start[nxt][k] = start[ptr][k];
                    } else {
                        // start anew
                        dp[nxt][k] = dp[ptr][k] + 1;
                        start[nxt][k] = i;
                    }
                    // Use a change (only if existing segment)
                    if (i > 1 && k > 0 && start[ptr][k - 1] <= last[a[i]]) {
                        // if this cost beats the old cost, or if it has a later start point, it's better.
                        if (dp[ptr][k - 1] < dp[nxt][k] || (dp[ptr][k - 1] == dp[nxt][k] && start[ptr][k - 1] > start[nxt][k])) {
                            dp[nxt][k] = dp[ptr][k - 1];
                            start[nxt][k] = start[ptr][k - 1];
                        }
                    }
                }
//                System.out.println(Arrays.toString(start[nxt]));
//                System.out.println(Arrays.toString(dp[nxt]));
                last[a[i]] = i;
                ptr = nxt;
            }
            for (int v : a) {
                last[v] = 0;
            }
            // always allowed to waste initial changes by starting offset, so mono decr
            out.println(dp[ptr][K]);
        }
        out.close();
    }
}