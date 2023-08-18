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
//        System.out.println(Arrays.toString(canonical));
        int[] freq = new int[MAX + 1];
        while (T-->0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] a = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                a[i] = canonical[sc.nextInt()];
            }
            int[][] transition = new int[K + 1][N + 1];
//            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int k = 0; k <= K; k++) {
                int l = N + 1;
                int duplicates = 0;
                for (int r = N; r >= 1; r--) {
                    while (l - 1 >= 1) {
                        int nextDuplicates = duplicates;
                        if (freq[a[l - 1]] >= 1) {
                            nextDuplicates++;
                        }
                        if (nextDuplicates <= k) {
                            duplicates = nextDuplicates;
                            freq[a[l - 1]]++;
                            l--;
                        } else {
                            break;
                        }
                    }
                    transition[k][r] = l;
                    if (--freq[a[r]] >= 1) {
                        duplicates--;
                    }
                }
            }
            int[][] dp = new int[K + 1][N + 1];
            int oo = (int) 1e9;
            for (int[] row : dp) {
                Arrays.fill(row, oo);
            }
            for (int k = 0; k <= K; k++) {
                dp[k][0] = 0;
            }
            for (int r = 1; r <= N; r++) {
                for (int k = 0; k <= K; k++) {
                    for (int delta = 0; delta <= k; delta++) {
                        dp[k][r] = min(dp[k][r], dp[k - delta][transition[delta][r] - 1] + 1);
                    }
                }
            }
            out.println(dp[K][N]);
        }
        out.close();
    }
}