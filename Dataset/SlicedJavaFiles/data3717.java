public class Main{    public static void main(String[] args) {
        sc = new FastScanner();
        pw = new PrintWriter(System.out);
        
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= 3200; i++) {
            boolean p = true;
            for (int j = 2; j*j <= i; j++) {
                if (i%j==0) {
                    p = false;
                    break;
                }
            }
            if (p) primes.add(i);
        }
        int Q = sc.ni();
        for (int q = 0; q < Q; q++) {
            int N = sc.ni();
            int K = sc.ni();
            int[] nums = new int[N+1];
            for (int i = 1; i <= N; i++) nums[i] = sc.ni();
            for (int i = 1; i <= N; i++) {
                for (int p: primes) {
                    int c = 0;
                    while (nums[i] % p == 0) {
                        nums[i] /= p;
                        c++;
                    }
                    if (c%2==1) nums[i] *= p;
                }
            }

            TreeSet<Integer> ts = new TreeSet<Integer>();
            HashMap<Integer,Integer> last = new HashMap<Integer,Integer>();

            int[][] dp = new int[N+1][K+1];
            for (int i = 1; i <= N; i++) {
                if (last.containsKey(nums[i])) {
                    ts.add(last.get(nums[i]));
                }
                last.put(nums[i],i);
                int[] inds = new int[K+1];
                int ind = 0;
                for (int x: ts.descendingSet()) {
                    inds[ind] = x;
                    if (ind==K) break;
                    ind++;
                }
                for (int j = 0; j <= K; j++) {
                    dp[i][j] = INF;
                    if (j > 0) dp[i][j] = dp[i][j-1];
                    for (int k = 0; k <= j; k++) {
                        dp[i][j] = Math.min(dp[i][j],dp[inds[k]][j-k]+1);
                    }
                }
            }
            pw.println(dp[N][K]);
        }
        pw.close();
    }
}