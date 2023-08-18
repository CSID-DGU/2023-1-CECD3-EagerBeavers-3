public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        t = new int[n];
        int T = sc.nextInt();
        genre = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            genre[i] = sc.nextInt();
        }
        memo = new int[4][1 << n][T+1];
        for (int[][] a : memo)
            for (int[] b : a)
                Arrays.fill(b, UNCALC);
        out.println(dp(0, 0, T));
        out.flush();
        out.close();
    }
}