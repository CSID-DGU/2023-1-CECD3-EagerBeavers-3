public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        long n = in.nextLong() - 1;
        long k = in.nextLong() - 1;
        if (k * (k + 1) / 2 < n) out.println(-1);
        else if (n == 0) out.println(0);
        else if (n < k) out.println(1);
        else {
            long t = binSearch(n, k, 1, k);
            long ans = k - t + 1;
            if (k * (k + 1) / 2 - t * (t - 1) / 2 != n) ans++;
            out.println(ans);
        }
        out.close();
    }
}