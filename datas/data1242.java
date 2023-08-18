public class Main{    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = in.nextInt();
        long correct = in.nextInt();
        long k = in.nextInt();
        long wrong = n - correct;
        long set = wrong * k + k - 1;
        if (set >= n) {
            out.println(correct);
        } else {
            long needExtraCorrect = n - (wrong * k + k - 1);
            long firstSet = needExtraCorrect + k - 1;
            long otherSet = correct - firstSet;

            long firstDouble = firstSet / k;
            otherSet += firstSet % k;
            long[][] mat = new long[][]{ {2, 2*k}, {0, 1}};
            long[][] A = pow(mat, firstDouble, MOD);
            long score = (A[0][1] + otherSet) % MOD;
            out.println(score);
        }
        out.flush();
    }
}