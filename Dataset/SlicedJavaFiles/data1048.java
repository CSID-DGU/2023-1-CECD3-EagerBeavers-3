public class Main{    public static void main(String[] args) throws IOException {
        long k = rl(), n = -1;
        for (long l = 0, r = k; l <= r; ) {
            long m = l + (r - l) / 2;
            if (f(m) < k) {
                n = m + 1;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        k -= f(n - 1);
        char[] s = Long.toString(n).toCharArray();
        prln(s[(int) k - 1]);
        close();
    }
}