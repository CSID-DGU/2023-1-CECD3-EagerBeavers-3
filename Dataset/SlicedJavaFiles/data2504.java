public class Main{    public static void main(String[] args) {
        InputReader s = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
//        t = s.nextInt();
        nexttest:
        while (t-- > 0) {
            int n = s.nextInt();
            int a[] = s.nextIntArray(n);

            HashMap<Integer, List<Pair>> sets = new HashMap<>();
            int pre[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                pre[i] = a[i - 1] + pre[i - 1];
            }

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    final Integer key = pre[j] - pre[i - 1];
                    if (!sets.containsKey(key)) {
                        sets.put(key, new ArrayList<>());
                    }

                    sets.get(key).add(new Pair(i, j));
                }
            }
//            System.out.println(sets);
            int ans = 0;
            List<Pair> answer = new ArrayList<>();
            int[] ansNextPos = new int[1];
            boolean[] ansTaken = new boolean[1];
            for (List<Pair> intervals : sets.values()) {

                Collections.sort(intervals);
                int[] nextPos = new int[intervals.size()];
                boolean[] taken = new boolean[intervals.size()];

                int[] dp = new int[intervals.size()];
                dp[intervals.size() - 1] = 1;
                taken[intervals.size() - 1] = true;
                nextPos[intervals.size() - 1] = -1;

                for (int i = intervals.size() - 2; i >= 0; i--) {
                    dp[i] = dp[i + 1];
                    taken[i] = false;
                    nextPos[i] = i + 1;

                    int ll = i + 1;
                    int rr = intervals.size();

                    while (ll < rr) {
                        int mid = ll + rr;
                        mid /= 2;
                        if (intervals.get(mid).x > intervals.get(i).y) {
                            rr = mid;
                        } else {
                            ll = mid + 1;
                        }
                    }
                    if (ll < intervals.size()) {
                        if (dp[i] < 1 + dp[ll]) {
                            dp[i] = Math.max(dp[i], 1 + dp[ll]);
                            taken[i] = true;
                            nextPos[i] = ll;
                        }
                    }
                }

                if (dp[0] > ans) {
                    ans = dp[0];
                    answer = intervals;
                    ansNextPos = nextPos;
                    ansTaken = taken;
                }
            }


            out.println(ans);
            int cur = 0;
            while (cur != -1) {
                if (ansTaken[cur]) {
                    out.println(answer.get(cur));
                }
                cur = ansNextPos[cur];
            }
        }

        out.close();
    }
}