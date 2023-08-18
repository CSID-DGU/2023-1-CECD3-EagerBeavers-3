public class Main{    public static void main(String[] args) throws Throwable {
        sc = new MyScanner();
        pw = new PrintWriter(System.out);

        n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        val = new int[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(val[i], Integer.MAX_VALUE);
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                for (int k = 0; k < m; k++)
                    val[i][j] = val[j][i] = Math.min(val[i][j], Math.abs(a[i][k] - a[j][k]));
            }

        val2 = new int[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(val2[i], Integer.MAX_VALUE);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m - 1; k++)
                    val2[i][j] = Math.min(val2[i][j], Math.abs(a[i][k] - a[j][k + 1]));
            }
        mem = new Integer[n][n][1 << n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp(i, i, 1 << i));
        }
        if (n == 1)
            pw.println(val2[0][0]);
        else
            pw.println(ans);


        pw.flush();
        pw.close();
    }
}