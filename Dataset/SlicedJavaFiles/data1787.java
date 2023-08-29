public class Main{    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        T = sc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] a = sc.nextIntArray(n);
            int[] ans = solve(n, a);
            StringJoiner j = new StringJoiner(" ");
            for (int each : ans) {
                j.add(String.valueOf(each));
            }
            pw.println(j.toString());
        }
        pw.flush();
    }
}