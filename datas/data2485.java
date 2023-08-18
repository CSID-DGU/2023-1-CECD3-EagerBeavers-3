public class Main{    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        out = new PrintWriter(System.out);
        s = new FastReader(oj);
        int n = s.nextInt();
        int[] arr = s.nextIntArray(n);
        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }

//        int max = Integer.MIN_VALUE;
        HashMap<Integer, ArrayList<pair>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(i == 0) {
                    ArrayList<pair> list = map.getOrDefault(sum[j], new ArrayList<>());
                    list.add(new pair(i, j));
                    map.put(sum[j], list);
                } else {
                    ArrayList<pair> list = map.getOrDefault(sum[j] - sum[i - 1], new ArrayList<>());
                    list.add(new pair(i, j));
                    map.put(sum[j] - sum[i - 1], list);
                }
            }
        }

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        ArrayList<pair> ans = null;
        for (int curr : keys) {
            ArrayList<pair> list = map.get(curr);
            Collections.sort(list);
            ArrayList<pair> smallAns = new ArrayList<>();
            smallAns.add(list.get(0));
            for (int k = 1; k < list.size(); k++) {
                if(list.get(k).start > smallAns.get(smallAns.size() - 1).finish) {
                    smallAns.add(list.get(k));
                }
            }

            if(ans == null) {
                ans = smallAns;
            } else {
                if(ans.size() < smallAns.size()) {
                    ans = smallAns;
                }
            }
        }

//        out.println(ans.size() + "\n" + ans);
//
//        out.println(map);
//
//        out.println(Arrays.toString(sum));
        StringBuilder ans1 = new StringBuilder();
        ans1.append(ans.size() + "\n");
        for (pair p : ans) {
            ans1.append((p.start + 1) + " " + (p.finish + 1));
            ans1.append("\n");
        }
        out.println(ans1);

        if (!oj) {
            System.out.println(Arrays.deepToString(new Object[]{System.currentTimeMillis() - time + " ms"}));
        }
        out.flush();
    }
}