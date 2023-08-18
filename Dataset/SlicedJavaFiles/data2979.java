public class Main{    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        long x = nextLong();
        long y = nextLong();
        long ans = 0;
        while (x > 0 && y > 0) {
            if (x > y) {
                ans += x / y;
                x %= y;
            }
            else {
                ans += y / x;
                y %= x;
            }
        }
        System.out.println(ans);
    }
}