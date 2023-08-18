public class Main{    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new FileOutputStream(new File(
                "output.txt")));
        //PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner();
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[][] map = new int[n][m];
        LinkedList<Point> q = new LinkedList();
        int reX = -1;
        int reY = -1;
        for (int i = 0; i < k; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            reX = x;
            reY = y;
            map[x][y] = 1;
            q.add(new Point(x, y));
        }

        while (!q.isEmpty()) {
            Point p = q.poll();
            // System.out.println(map[p.x][p.y] + " " + p.x + " " + p.y);
            for (int i = 0; i < 4; i++) {
                int x = p.x + X[i];
                int y = p.y + Y[i];
                if (x >= 0 && y >= 0 && x < n && y < m && map[x][y] == 0) {
                    map[x][y] = 1 + map[p.x][p.y];
                    if (map[x][y] > map[reX][reY]) {
                        reX = x;
                        reY = y;
                    }

                    q.add(new Point(x, y));
                }
            }
        }
        out.println((reX + 1) + " " + (reY + 1));
        out.close();

    }
}