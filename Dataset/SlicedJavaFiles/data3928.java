public class Main{    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int k = sc.nextInt();
        int cur = 0;
        a = new long[75007]; long sum = 0;
        type = new int[75007];
        map = new HashMap<>();
        long [] typeSum = new long[k];
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt(); long temp = sum;
            for (int j = 0; j < n; j++) {
                cur++;
                a[cur] = sc.nextLong();
                type[cur] = i;
                map.put(a[cur], cur);
                sum += a[cur];
            }
            typeSum[i] = sum - temp;
        }
        boolean notDiv = sum % k != 0;
        long need = sum / k;
        int n = cur;
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            long delta = need - typeSum[type[i]];
            long find = a[i] + delta;
            if (map.containsKey(find)) {
                if (type[map.get(find)] != type[i] || delta == 0) adj[i].add(map.get(find));
            }
        }
        vis = new int[n + 1];
        good = new boolean[1 << k];
        good[0] = true;
        nodes = new HashSet[1 << k];
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                cy = new HashSet<>();
                boolean b = dfs(i);
                int mask = 0;
                for (Integer node: cy) {
                    mask |= (1 << type[node]);
                }
                if (mask != 0) nodes[mask] = cy;
                good[mask] = true;
            }
        }
        dp = new int[1 << k];
        Arrays.fill(dp, -1);
        int possible = solve((1 << k) - 1);
        if (possible == 1 && !notDiv) {
            ArrayList<Integer> masks = dfs2((1 << k) - 1);

            long [] num = new long[k];
            int [] ret = new int[k];
            for (Integer mask: masks) {
                for (Integer node: nodes[mask]) {
                    num[type[node]] = a[node];
                    ret[type[adj[node].get(0)]] = type[node] + 1;
                }
            }
            boolean good = true; Set<Integer> soFar = new HashSet<>();
            for (int i = 0; i < ret.length; i++) {
                if (soFar.contains(ret[i])) good = false;
                soFar.add(ret[i]);
            }
            if (!good) {
                out.println("No");
                out.close();
                return;
            }
            out.println("Yes");
            for (int i = 0; i < k; i++) {
                out.println(num[i] + " " + ret[i]);
            }
        } else {
            out.println("No");
        }
        out.close();
    }
}