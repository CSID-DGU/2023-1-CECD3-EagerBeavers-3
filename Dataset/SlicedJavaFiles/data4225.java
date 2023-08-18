public class Main{    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FastIO in = new FastIO();
        int t = in.ni();
        // int t = 1;
        while (t-- > 0) {
            int n = in.ni();
            int m = in.ni();
            int a[][] = new int[n][m];
            int b[][] = new int[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.ni();
                    b[j][i] = a[i][j];
                }
            }
            for (int i = 0; i < m; i++) {
                Arrays.sort(b[i]);
            }
            Data d[] = new Data[m];
            for (int i = 0; i < m; i++) {
                d[i] = new Data(-b[i][n - 1], i);
            }
            Arrays.sort(d);

            int col = Math.min(n, m);
            int c[][] = new int[n][col];
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < n; j++) {
                    c[j][i] = a[j][d[i].b];
                }
            }
            // for (int i = 0; i < n; i++) {
            //     for (int j = 0; j < col; j++) {
            //         System.out.print(c[i][j] + " ");
            //     }
            //     System.out.println();
            // }
            System.out.println(ans(c, n, col, 0));
        }
        in.bw.flush();
    }
}