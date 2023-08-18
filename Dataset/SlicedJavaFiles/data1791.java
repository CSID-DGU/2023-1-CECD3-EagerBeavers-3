public class Main{    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        int[]a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = nextInt();
        }
        if (k >= m) {
            System.out.println(0);
            return;
        }
        Arrays.sort(a, 1, n+1);
        int ans = 0;
        for (int i = n; i >= 1; i--) {
            ans++;
            k--;
            k += a[i];
            if (k >= m) {
                System.out.println(ans);
                return;
            }
        }
        System.out.println(-1);
        pw.close();
    }
}