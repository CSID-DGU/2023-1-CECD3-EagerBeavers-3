public class Main{    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);
        int n = nextInt();
        int k = nextInt();
        long l = -1;
        long r = 100000;
        while(l != r - 1) {
            long mid = (l + r) / 2;
            if (mid * (mid + 1) / 2 - (n - mid) > k) r = mid;
            else l = mid;
        }
        pw.println(n - l);
        pw.close();
    }
}