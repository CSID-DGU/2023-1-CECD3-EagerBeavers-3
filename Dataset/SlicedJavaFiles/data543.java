public class Main{    public static void main(String[] args) throws IOException {
        init_io();
        int t = nint();
        while(t-- > 0) {
            int N = nint();
            if (N % 2 != 0) {
                out.println("NO"); continue;
            }
            N /= 2;
            int sqrt = (int)(Math.round(Math.sqrt(N)));
            int sqrt2 = (int)(Math.round(Math.sqrt(N/2)));
            if (sqrt * sqrt == N || sqrt2 * sqrt2 * 2 == N) {
                out.println("YES");
            }
            else {
                out.println("NO");
            }
        }
        out.close();
    }
}