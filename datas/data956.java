public class Main{    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        PrintWriter printer = new PrintWriter(System.out);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long l = 1;
        long r = n;
        while(true){
            long m = (l + r) / 2;
            long x = (m * (m + 1)) / 2;
            x -= n - m;
            if (x == k) {
                printer.println(n - m);
                break;
            } else if (x < k) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        printer.flush();
        printer.close();
    }
}