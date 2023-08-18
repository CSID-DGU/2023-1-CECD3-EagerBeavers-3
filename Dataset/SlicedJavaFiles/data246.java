public class Main{    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt(), N = (int) 5e6 + 1;
        int left = 0, right = 0;
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
            if (a[i] == k) left++;
        }
        int f[] = new int[N + 1];
        int ans = 0;
        for (int i = n; i >= 1; i--) {
            if (a[i] == k) left--;
            f[a[i]]++;
            f[a[i]] = max(f[a[i]], 1 + right);
            ans = max(ans, f[a[i]] + left);
            if (a[i] == k) right++;
        }
        pw.println(ans);
        pw.close();
    }
}