public class Main{    public static void main(String[] args) throws IOException {
        int n = ri(), a[] = ria(n), pre[] = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            pre[i + 1] = pre[i] + a[i];
        }
        Map<Integer, List<p>> sums = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; ++j) {
                sums.computeIfAbsent(pre[i + 1] - pre[j], k -> new ArrayList<>()).add(new p(j, i));
            }
        }
        int k = 0;
        List<p> ans = new ArrayList<>();
        for (int key : sums.keySet()) {
            List<p> segs = sums.get(key);
            segs.sort((x, y) -> x.b == y.b ? x.a - y.a : x.b - y.b);
            int last = -1, cnt = 0;
            for (int i = 0, end = segs.size(); i < end; ++i) {
                if (segs.get(i).a > last) {
                    ++cnt;
                    last = segs.get(i).b;
                }
            }
            if (cnt > k) {
                k = cnt;
                ans = segs;
            }
        }
        prln(k);
        int last = -1;
        for (int i = 0, end = ans.size(); i < end; ++i) {
            if (ans.get(i).a > last) {
                prln(ans.get(i).a + 1, ans.get(i).b + 1);
                last = ans.get(i).b;
            }
        }
        close();
    }
}