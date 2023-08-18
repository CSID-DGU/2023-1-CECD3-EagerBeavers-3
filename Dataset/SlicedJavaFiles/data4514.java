public class Main{    public static void main(String args[]) throws Throwable {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            StringTokenizer st = new StringTokenizer(ln);
            N = parseInt(st.nextToken());
            M = parseInt(st.nextToken());
            char[] S = in.readLine().toCharArray();
            Q = new long[M][M];
            mem = new long[1 << M];
            Arrays.fill(mem, -1);
            for (int i = 1; i < N; i++)
                Q[S[i - 1] - 'a'][S[i] - 'a'] = Q[S[i] - 'a'][S[i - 1] - 'a'] = Q[S[i - 1] - 'a'][S[i] - 'a'] + 1;
            calculateSums();
            for (int i = (1 << M) - 1; i >= 0; i--)
                f(i);
            System.out.println(f(0));
        }
    }
}