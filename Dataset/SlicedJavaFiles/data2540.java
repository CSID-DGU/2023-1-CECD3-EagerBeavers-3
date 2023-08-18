public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        long[] cum = new long[n];
        cum[0] = a[0];
        for (int i = 1; i < n; i++)
            cum[i] = a[i] + cum[i - 1];
        HashMap<Long, ArrayList<Pair>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                long cur = get(cum, i, j);
                if (!hm.containsKey(cur)) hm.put(cur, new ArrayList<>());
                hm.get(cur).add(new Pair(i, j));
            }
        }
        int max = 0;
        StringBuilder ans = new StringBuilder();
        for (long sum : hm.keySet()) {
            ArrayList<Pair> cur = hm.get(sum);
            Collections.sort(cur);
            int poss = 0;
            int r = -1;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < cur.size(); i++) {
                if (cur.get(i).left > r) {
                    poss++;
                    r = cur.get(i).right;
                    sb.append(cur.get(i));
                }
            }
            if (poss> max){
                max = poss;
                ans = sb;
            }
        }
        out.println(max);
        out.println(ans);
        out.flush();
        out.close();
    }
}