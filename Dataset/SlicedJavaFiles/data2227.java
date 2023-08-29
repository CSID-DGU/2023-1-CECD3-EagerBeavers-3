public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String X = in.next();
        int N = X.length();

        int[] P = new int[701];
        P[0] = 1;
        for (int i=1; i<P.length; ++i) {
            P[i] = (int)((long)P[i-1] * 10 % REM);
        }

        int ans = 0;
        for (int d=1; d<=9; ++d) { //at least d
            dig = d;

            for (int[][] array2 : dp) {
                for (int[] array1 : array2) {
                    Arrays.fill(array1, -1);
                }
            }

            for (int c=1; c<=N; ++c) { //exact count of at least d
                for (int k=0; k<c; ++k) {
                    ans = (int)((ans + (long)f(0, c, false, X) * P[k]) % REM);
                }
            }
        }
        System.out.println(ans);
    }
}