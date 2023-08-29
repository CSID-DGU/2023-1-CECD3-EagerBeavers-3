public class Main{    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        n = in.nextInt();
//       n = 19;?
        int m = in.nextInt();
        adj = new boolean[n][n];
//       for (int i = 0; i < n; i++) {
//       for (int j = 0; j < n; j++) {
//       adj[i][j] = true;
//       }
//       }
        dp = new long[1 << n][n];
        for (int i = 0; i < m; i++) {
            int f = in.nextInt() - 1;
            int t = in.nextInt() - 1;
            adj[f][t] = adj[t][f] = true;
        }

        boolean[] v = new boolean[1 << n];
        long res = 0;
        for (int f = 0; f < n; f++) {
            first = f;
            int cnt;
            for (int i = 0; i < 1 << n; i+=(1<<first))
                if ((i & (1 << first)) == 0)
                    for (int j = 0; j < n; j++)
                        dp[i][j] = -1;
            
            for (int i = 0; i < 1 << n; i+= (1<<first)) {
                cnt = Integer.bitCount(i);
                if ((i & (1 << first)) == 0 && !v[i | (1 << first)] && cnt > 1) {
                    v[i | (1 << first)] = true;
                    res += solve(i, first, cnt);
                }
            }
        }
        System.out.println(res / 2);
    }
}