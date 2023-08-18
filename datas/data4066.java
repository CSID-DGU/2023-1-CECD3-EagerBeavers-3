public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point start = new Point(in.nextInt(), in.nextInt());
        n = in.nextInt();
        Point[] A = new Point[n];
        for (int i = 0; i < n; i++)
            A[i] = new Point(in.nextInt(), in.nextInt());
        DP = new int[1 << n];
        Next = new Point[1 << n];
        Arrays.fill(DP, -1);
        pair = new int[n][n];
        single = new int[n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                int dx1 = A[i].x - start.x;
                int dy1 = A[i].y - start.y;
                int dx2 = A[j].x - A[i].x;
                int dy2 = A[j].y - A[i].y;
                int dx3 = A[j].x - start.x;
                int dy3 = A[j].y - start.y;
                pair[i][j] = dx1 * dx1 + dy1 * dy1 + dx2 * dx2 + dy2 * dy2
                        + dx3 * dx3 + dy3 * dy3;
                single[i] = 2 * (dx1 * dx1 + dy1 * dy1);
            }
        int ans = get(0);
        System.out.println(ans);
        int mask = 0;
        while (mask + 1 != (1 << n)) {
            Point temp = Next[mask];
            if (temp.y == -1)
                System.out.print("0 " + (temp.x + 1) + " ");
            else {
                System.out
                        .print("0 " + (temp.x + 1) + " " + (temp.y + 1) + " ");
                mask |= (1 << temp.y);
            }
            mask |= (1 << temp.x);
        }
        System.out.println("0");
    }
}