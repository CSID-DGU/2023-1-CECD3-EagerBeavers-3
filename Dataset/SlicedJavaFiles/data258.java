public class Main{    public static void main(String[] args) throws Exception {
        MyScanner scan = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = scan.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (solve(i, vals)) {
                out.print('A');
            } else {
                out.print('B');
            }
        }

        out.close();
    }
}