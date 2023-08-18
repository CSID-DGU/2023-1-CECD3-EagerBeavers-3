public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        // System.out.println(1 << 24);
        hand = new Point(in.nextInt(), in.nextInt());
        n = in.nextInt();
        data = new Point[n];
        for (int i = 0; i < n; i++) {
            data[i] = new Point(in.nextInt(), in.nextInt());
        }
        pre = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pre[i][j] = distance(data[i], data[j]);
            }
        }


        next = new int[1 << n];
        dp = new int[1 << n];
        Arrays.fill(dp, -1);

        out.println(cal(0));


        int start = 0;

        do {
            int m = next[start];
            int val = m - start;
            out.print(0 + " ");
            for (int i = 0; i < n; i++) {
                if (((1 << i) & val) != 0) {
                    out.print((i + 1) + " ");
                }
            }
            // out.print(0 + " ")  ;
            start = m;
        } while (start != (1 << n) - 1);
        out.println(0);
        out.close();
    }
}