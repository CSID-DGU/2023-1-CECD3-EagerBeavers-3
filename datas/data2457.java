public class Main{    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        int[] pre = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            pre[i] = pre[i - 1] + sc.nextInt();
        }
        var sumMap = new HashMap<Integer, ArrayList<Pair>>();
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                int sum = pre[j] - pre[i - 1];
                sumMap.computeIfAbsent(sum, val -> new ArrayList<>()).add(new Pair(i, j));
            }
        }
        var ans = new ArrayList<Pair>();
        for (var list : sumMap.values()) {
            Collections.sort(list, Comparator.comparingInt(p -> p.r));
            // greedily schedule the intervals
            int last = 0;
            var group = new ArrayList<Pair>();
            for (Pair p : list) {
                if (p.l > last) {
                    group.add(p);
                    last = p.r;
                }
            }
            if (group.size() > ans.size()) {
                ans = group;
            }
        }
        out.println(ans.size());
        for (Pair p : ans) {
            out.println(p);
        }
        out.close();
    }
}