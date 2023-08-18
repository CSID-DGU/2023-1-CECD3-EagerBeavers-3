public class Main{    public static void main(String[] args) throws FileNotFoundException {
        // PrintWriter out = new PrintWriter(new FileOutputStream(new File(
        // "output.txt")));
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner();
        long n = in.nextLong();
        long s = in.nextLong();
        if (s == 0) {
            out.println(n);
        } else {
            String N = "" + n;
            dp = new long[N.length()][163][2][2];
            long re = 0;
            for (int i = 1; i < 163 && i <= n; i++) {
                long tmp = s + i;
                if (tmp <= n) {
                    String S = "" + tmp;
                    while(S.length() < N.length()){
                        S = '0' + S;
                    }
                    for (long[][][] a : dp) {
                        for (long[][] b : a) {
                            for (long[] c : b) {
                                Arrays.fill(c, -1);
                            }
                        }
                    }
                    re += cal(0, i, 0, 0, N, S);
                }
            }
            out.println(re);
        }
        out.close();
    }
}