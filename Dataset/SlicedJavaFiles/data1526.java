public class Main{    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int k = nextInt();
        Integer[]a = new Integer[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = nextInt();
        }
        if (k==1) {
            System.out.println(n);
            return;
        }
        Arrays.sort(a, 1, n+1);
        Set<Integer> set = new HashSet<Integer>();
        int ans = 0;
        int INF = (int) 1e9;
        for (int i = 1; i <= n; i++) {
            if (set.contains(a[i]))
                continue;
            int t = a[i];
            int s = 1;
            while ((long)t*k <= INF) {
                t *= k;
                if (Arrays.binarySearch(a, 1, n+1,  t) >= 0) {
                    set.add(t);
                    s++;
                }
                else
                    break;
            }
            if (s % 2==0)
                ans += s/2;
            else
                ans += s/2+1;
        }
        System.out.println(ans);
        pw.close();
    }
}