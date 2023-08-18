public class Main{    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
        n = nextInt();
        m = nextInt();
        int k = nextInt();
        used = new boolean[n][m];
        Deque<point> deq = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            deq.addLast(new point(nextInt() - 1, nextInt() - 1));
            used[deq.peekLast().x][deq.peekLast().y] = true;
        }
        point last = new point(0, 0);
        while (!deq.isEmpty()) {
            point v = deq.pollFirst();
            int x = v.x;
            int y = v.y;
            if (checker(x, y + 1)) {
                last = new point(x, y + 1);
                deq.addLast(new point(x, y + 1));
                used[x][y + 1] = true;
            }
            if (checker(x, y - 1)) {
                last = new point(x, y - 1);
                deq.addLast(new point(x, y - 1));
                used[x][y - 1] = true;
            }
            if (checker(x + 1, y)) {
                last = new point(x + 1, y);
                deq.addLast(new point(x + 1, y));
                used[x + 1][y] = true;
            }
            if (checker(x - 1, y)) {
                last = new point(x - 1, y);
                deq.addLast(new point(x - 1, y));
                used[x - 1][y] = true;
            }
        }
        out.println(last.x + 1 + " " + (last.y + 1));
        out.close();
    }
}