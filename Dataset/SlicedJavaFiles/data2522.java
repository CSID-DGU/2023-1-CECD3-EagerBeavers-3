public class Main{    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        int[] pre = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            pre[i] = pre[i - 1] + sc.nextInt();
        }
//        var sumMap = new HashMap<Integer, ArrayList<Pair>>();
//        var sums = new ArrayList<Pair>();
        Pair[] sums = new Pair[N * (N + 1) / 2];
        int k = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                int sum = pre[j] - pre[i - 1];
//                sumMap.computeIfAbsent(sum, val -> new ArrayList<>()).add(new Pair(i, j, sum));
                sums[k++] = new Pair(i, j, sum);
            }
        }
        Arrays.sort(sums, (p1, p2) -> p1.sum - p2.sum != 0 ? p1.sum - p2.sum : p1.r - p2.r);
        var ans = new ArrayList<Pair>();
        int i = 0;
        while (i < k) {
            var group = new ArrayList<Pair>();
            int last = 0;
            int j = i;
            while (j < k && sums[j].sum == sums[i].sum) {
                if (sums[j].l > last) {
                    group.add(sums[j]);
                    last = sums[j].r;
                }
                j++;
            }
//            System.out.println(group);
            if (group.size() > ans.size()) {
                ans = group;
            }
            i = j;
        }
        out.println(ans.size());
        for (Pair p : ans) {
            out.println(p);
        }
        out.close();
    }
}