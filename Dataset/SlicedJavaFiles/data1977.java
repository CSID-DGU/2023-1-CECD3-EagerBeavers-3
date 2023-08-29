public class Main{    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(st.nextToken());

        Team[] a = new Team[n];
        int[] c = new int[n + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int p = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            a[i] = new Team(p, t, i);
        }

        Arrays.sort(a);
        int prev = 1;
        c[1]++;

        for (int i = 1; i < n; i++) {
            if (a[i].pr == a[i - 1].pr && a[i].time == a[i - 1].time)
                for (int j = i + 1; j >= prev; j--)
                    c[j] = i + 2 - prev;
            else {
                prev = i + 1;
                c[prev] = 1;
            }
        }

        out.println(c[k]);
        out.close();
    }
}