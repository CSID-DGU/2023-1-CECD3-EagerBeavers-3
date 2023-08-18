public class Main{    public static void main(String[] args) {
        pow = new int[15];
        pow[0] = 1;
        for (int i = 1; i < pow.length; i++) {
            pow[i] = pow[i - 1] * 2;
        }
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            n = in.nextInt();
            int m = in.nextInt();
            int[][] arr = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] = in.nextInt();
                }
            }
            Pair[] best = new Pair[m];
            for (int j = 0; j < m; j++) {
                best[j] = new Pair(j);
                for (int k = 0; k < n; k++) {
                    best[j].update(arr[k][j]);
                }
            }
            Arrays.sort(best);
            real = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < Math.min(n, m); k++) {
                    real[j][k] = arr[j][best[k].k];
                }
            }
            dp = new int[1 << n][];
            Stack<Integer>[] min = new Stack[n + 1];
            for (int j = 0; j <= n; j++) {
                min[j] = new Stack<>();
            }
            for (int j = 0; j < dp.length; j++) {
                int cnt = 0;
                for (int k = 0; k < n; k++) {
                    if ((j & pow[k]) != 0) {
                        cnt++;
                    }
                }
                min[cnt].add(j);
            }
            for (int j = 0; j < min.length; j++) {
                for (int x : min[j]) {
                    if (j == 0) {
                        dp[x] = new int[n];
                    } else {
                        calc(x);
                    }
                }
            }
            System.out.println(sum(dp[dp.length - 1]));
        }
    }
}