public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        n = sc.nextInt(); m = sc.nextInt(); k = sc.nextInt();
        int[] xs = new int[k], ys = new int[k];
        for(int i = 0; i < k; i++) {
            xs[i] = sc.nextInt() - 1; ys[i] = sc.nextInt() - 1;
        }

        int[][] dist = bfs(xs, ys);

        int x = 0, y = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                if(dist[i][j] > dist[x][y]) {
                    x = i; y = j;
                }
        x++; y++;
        PrintWriter out = new PrintWriter("output.txt");
        out.println(x + " " + y);
        out.flush();
        out.close();
    }
}