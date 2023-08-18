public class Main{    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        n = sc.nextInt();
        m = sc.nextInt();
        int k = sc.nextInt();
        fire = new boolean[n][m];
        Queue<Pos> q = new LinkedList<Pos>();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            q.add(new Pos(x - 1, y - 1));
            fire[x - 1][y - 1] = true;
        }
        int[] di = new int[] { 1, -1, 0, 0 };
        int[] dj = new int[] { 0, 0, 1, -1};
        Pos last = null;
        while (q.size() > 0) {
            Pos pos = q.poll();
            last = pos;
            for (int kk = 0; kk < 4; kk++) {
                int ni = pos.i + di[kk];
                int nj = pos.j + dj[kk];
                if (ni >= 0 && nj >= 0 && ni < n && nj < m) {
                    if (!fire[ni][nj]) {
                        fire[ni][nj] = true;
                        q.add(new Pos(ni, nj));
                    }
                }
            }
        }
        PrintWriter out = new PrintWriter(new File("output.txt"));
        out.println((last.i + 1) + " " + (last.j + 1));
        out.flush();
        out.close();
    }
}