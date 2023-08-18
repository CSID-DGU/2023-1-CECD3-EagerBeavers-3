public class Main{    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        int[] pre = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            pre[i] = pre[i - 1] + sc.nextInt();
        }
//        var sumMap = new HashMap<Integer, ArrayList<Pair>>();
        var sums = new ArrayList<Pair>();
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                int sum = pre[j] - pre[i - 1];
//                sumMap.computeIfAbsent(sum, val -> new ArrayList<>()).add(new Pair(i, j, sum));
                sums.add(new Pair(i, j, sum));
            }
        }
        Collections.sort(sums, (p1, p2) -> p1.sum - p2.sum != 0 ? p1.sum - p2.sum : p1.r - p2.r);
        var ans = new ArrayList<Pair>();
        int i = 0;
        while (i < sums.size()) {
            int j = i;
            var group = new ArrayList(List.of(sums.get(i)));
            int last = sums.get(i).r;
            while (j + 1 < sums.size() && sums.get(j + 1).sum == sums.get(j).sum) {
                if (sums.get(j + 1).l > last) {
                    group.add(sums.get(j + 1));
                    last = sums.get(j + 1).r;
                }
                j++;
            }
//            System.out.println(group);
            if (group.size() > ans.size()) {
                ans = group;
            }
            i = j + 1;
        }
        out.println(ans.size());
        for (Pair p : ans) {
            out.println(p);
        }
        out.close();
    }
}