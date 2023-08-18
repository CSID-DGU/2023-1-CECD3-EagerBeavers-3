public class Main{    public static void main(String[] args) {
//        generate();
        int MAX = (int) 1e7;
        int[] spf = new int[MAX + 1];
        for (int i = 2; i <= MAX; i++) {
            if (spf[i] == 0) {
                spf[i] = i;
                for (int j = i + i; j <= MAX; j += i) {
                    if (spf[j] == 0) {
                        spf[j] = i;
                    }
                }
            }
        }
        int[] freq = new int[MAX + 1];
        int T = sc.nextInt();
        while (T-->0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] a = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                a[i] = sc.nextInt();
                int canonical = 1;
                while (a[i] > 1) {
                    int factor = spf[a[i]];
                    int parity = 0;
                    while (a[i] % factor == 0) {
                        a[i] /= factor;
                        parity ^= 1;
                    }
                    if (parity == 1) {
                        canonical *= factor;
                    }
                }
                a[i] = canonical;
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