public class Main{    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            ans = 0;
            n = sc.nextInt();
            int m = sc.nextInt();
            boolean[] taken = new boolean[m];
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            a = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++) {
                    int cur = sc.nextInt();
                    pq.add(new Pair(i, j, cur));
                    a[i][j] = cur;
                }
            cols = new ArrayList<>();
            while (!pq.isEmpty() && cols.size() < 8) {
                Pair cur = pq.remove();
                if (!taken[cur.j]) cols.add(cur.j);
                taken[cur.j] = true;
            }
            solve(0,new int [cols.size()]);
            out.println(ans);
        }
        out.flush();
        out.close();
    }
}