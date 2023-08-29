public class Main{    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        n = sc.nextInt();
        k = sc.nextInt();
        long l = 0;
        long r = n + 1;
        while (l + 1 != r) {
            long m = (r + l) / 2;
            if (check(m))
                l = m;
            else
                r = m;
        }
        pw.print(l * (l + 1L) / 2L - k);
        pw.close();
    }
}