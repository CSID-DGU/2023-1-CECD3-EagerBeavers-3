public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        n = in.nextInt();
        data = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = in.nextDouble();
            }
        }
        dp = new double[1 << n];
        Arrays.fill(dp, -1);
        for (int i = 0; i < n; i++) {
            int a = 1 << i;
            out.print(cal(a) + " ");
        }
        out.close();
        //System.out.print(builder.toString());
    }
}