public class Main{    public static void main(String[] args) {

        int n = i();
        int m = i();
        int k = i();

        int[][] a = new int[n][m - 1];
        for (int i = 0; i < n; i++) {
            a[i] = input(m - 1);
        }

        int[][] b = new int[n - 1][m];
        for (int i = 0; i < n - 1; i++) {
            b[i] = input(m);
        }

        if (k % 2 > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    out.print(-1 + " ");
                }
                out.println();
            }
            out.flush();
            return;
        }

        int[][][] f = new int[n][m][k / 2 + 1];

        for (int s = 1; s <= k / 2; s++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int ans = -1;

                    if (j > 0) {
                        ans = f[i][j - 1][s - 1] + a[i][j - 1];
                    }
                    if (i > 0) {
                        int t = f[i - 1][j][s - 1] + b[i - 1][j];
                        ans = ans == -1 ? t : Math.min(ans, t);
                    }
                    if (i < n - 1) {
                        int t = f[i + 1][j][s - 1] + b[i][j];
                        ans = ans == -1 ? t : Math.min(ans, t);
                    }
                    if (j < m - 1) {
                        int t = f[i][j + 1][s - 1] + a[i][j];
                        ans = ans == -1 ? t : Math.min(ans, t);
                    }

                    f[i][j][s] = ans;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                out.print(f[i][j][k / 2] * 2 + " ");
            }
            out.println();
        }
        out.flush();
    }
}