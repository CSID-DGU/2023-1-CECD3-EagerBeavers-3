public class Main{    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
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
        dp = new int[1 << m];
        Arrays.fill(dp, -1);
        pw.println(solve(0, 0));

        pw.close();
    }
}