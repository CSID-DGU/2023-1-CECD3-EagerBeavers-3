public class Main{    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        int[] pre = new int[N + 1];
        var ansMap = new HashMap<Integer, ArrayDeque<Pair>>();
        for (int j = 1; j <= N; j++) {
            pre[j] = pre[j - 1] + sc.nextInt();
            for (int i = j; i >= 1; i--) {
                int sum = pre[j] - pre[i - 1];
                /**
                 we can actually perform the greedy scheduling as we read in the information!
                 Because we are sweeping with an increasing right pointer, the moment a sum is
                 found with this right endpoint, we can greedily place it into the schedule
                 for a given sum "bucket", (if it's disjoint. Otherwise, we would be replacing
                 one OR MORE previous intervals, which would only decrease or keep the same size,
                 while reducing our future accessibility for adding intervals!)
                 */
                if (!ansMap.containsKey(sum) || ansMap.get(sum).getLast().r < i) {
                    var dq = ansMap.computeIfAbsent(sum, val -> new ArrayDeque<>());
                    dq.add(new Pair(i, j, sum));
                }
            }
        }
        var ans = new ArrayDeque<Pair>();
        for (var group : ansMap.values()) {
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