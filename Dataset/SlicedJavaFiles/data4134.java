public class Main{    public static void main(String[] args) {
        init();
        Scanner s = new Scanner(System.in);
        x = s.nextInt(); y = s.nextInt();
        n = s.nextInt();
        xs = new int[n]; ys = new int[n];
        tb = new int[1 << n]; prevs = new int[1 << n];

        for (int i = 0; i < n; i++) {
            xs[i] = s.nextInt(); ys[i] = s.nextInt();
            tb[1 << i] = sqr(x - xs[i]) + sqr(y - ys[i]) << 1;
        }

        int all = (1 << n) - 1;
        out.println(recur(all));
        StringBuilder sb = new StringBuilder();
        int p = prevs[all];
        int c = all;
        while(p != 0 && p != c) {
            if ((p ^ (p & -p)) == 0) sb.append("0 " + (es.get(p & -p) + 1) + " ");
            else sb.append("0 " + (es.get(p & -p) + 1) + " " + (es.get(p ^ (p & -p)) + 1) + " ");
            c = c ^ p;
            p = prevs[c];
        }

        if ((c ^ (c & -c)) == 0) sb.append("0 " + (es.get(c & -c) + 1) + " 0");
        else sb.append("0 " + (es.get(c & -c) + 1) + " " + (es.get(c ^ (c & -c)) + 1) + " 0");
        out.println(sb);
    }
}