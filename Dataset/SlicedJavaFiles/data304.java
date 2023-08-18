public class Main{    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        U = new int[N-1];
        V = new int[N-1];
        for (int i = 0; i < N - 1; i++) {
            U[i] = sc.nextInt()-1;
            V[i] = sc.nextInt()-1;
        }
        A = sc.nextIntArray(N, -1);

        System.out.println(solve() ? "Yes" : "No");
    }
}