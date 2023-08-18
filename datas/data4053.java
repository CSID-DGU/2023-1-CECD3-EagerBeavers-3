public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(scan.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int T[] = new int[n];
        int G[] = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(scan.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            G[i] = Integer.parseInt(st.nextToken());
        }
        long ans = 0;
        for (int mask = 1; mask < (1 << n); mask++) {
            int sum = 0;
            int g1 = 0;
            int g2 = 0;
            int g3 = 0;

            for (int i = 0; i < n; i++) {
                if (((1 << i) & mask) > 0) {
                    sum += T[i];
                    if (G[i] == 1) g1++;
                    if (G[i] == 2) g2++;
                    if (G[i] == 3) g3++;
                }
            }
            cnt = 0;
            if (sum == t) f(g1, g2, g3, -1);
            for (long i = 1; i <= g1; i++) cnt *= i;
            for (long i = 1; i <= g2; i++) cnt *= i;
            for (long i = 1; i <= g3; i++) cnt *= i;
            ans += cnt;
        }
        System.out.println(ans % 1000000007);
    }
}