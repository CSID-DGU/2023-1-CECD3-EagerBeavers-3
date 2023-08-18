public class Main{    public static void main(String[] args) throws Throwable {
        sc = new MyScanner();
        pw = new PrintWriter(System.out);

        n = sc.nextInt();
        T = sc.nextLong();
        p = new int[n];
        l = new int[n];
        x = new int[n];
        t = new int[n];
        adj = new ArrayList[n];

        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            t[i] = sc.nextInt();
        adj[0] = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            adj[i] = new ArrayList<>();
            p[i] = sc.nextInt() - 1;
            l[i] = sc.nextInt();
            adj[p[i]].add(i);
        }

        ftCnt = new long[N];
        ftSum = new long[N];
        ans = new long[n];

        dfs(0);
        pw.println(ans[0]);

        pw.flush();
        pw.close();
    }
}