public class Main{    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        matrix = new boolean[n][n];
        for (int i=0; i<m; ++i) {
            int v1 = s.nextInt()-1;
            int v2 = s.nextInt()-1;
            matrix[v1][v2] = true;
            matrix[v2][v1] = true;
        }
        dp = new long[n][1<<n+1];
        for (int i=0; i<n; ++i) Arrays.fill(dp[i], -1);
        
        long res = 0;
        for (int i=0; i<n; ++i)
            res += calc(i, i, (1<<i), 1);
        
        System.out.println(res/2);
    }
}