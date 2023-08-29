public class Main{    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = in.nextInt();
        m = in.nextInt();
        s = in.next().toCharArray();
        g = new int[m][m];
        for (int i = 1; i < n; i++) {
            int x = s[i - 1] - 'a', y = s[i] - 'a';
            if (x != y) {
                g[x][y]++;
                g[y][x]++;
            }
        }
        cost = new int[m][1 << m];
        for (int i = 0; i < m; i++) {
            int w = 0;
            for (int j = 0; j < m; j++) w += g[i][j];
            pre(i, 0, 0, -w);
        }
        dp = new int[1 << m];
        Arrays.fill(dp, -1);
        pw.println(solve(0, 0));

        pw.close();
    }
}