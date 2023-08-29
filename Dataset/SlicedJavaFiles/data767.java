public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        char[] ch = reader.readLine().toCharArray();

        LinkedList<Integer>[] p = new LinkedList[52];

        for (int i = 0; i < 52; i++) {
            p[i] = new LinkedList<>();
        }

        int[] fc = new int[n];

        for (int i = 0; i < n; i++) {
            int cc = f(ch[i]);
            p[cc].add(i);
            fc[i] = cc;
        }
        int en = 0;
        for (int i = 0; i < 52; i++) {
            if (p[i].size() > 0) en = Math.max(en, p[i].poll());
        }

        int mx = en + 1;

        for (int i = 0; i < n; i++) {
            if (p[fc[i]].size() == 0) break;
            en = Math.max(en, p[fc[i]].poll());
            mx = Math.min(mx, en - i);
        }

        System.out.println(mx);
    }
}