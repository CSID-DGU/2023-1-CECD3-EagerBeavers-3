public class Main{    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        res = new double[n];
        r = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double max = r;
            for (int j = 0; j < i; j++) {
                max = Math.max(max, solve(x[i], x[j], j));
            }
            if (i > 0) out.print(" ");
            res[i] = max;
            out.printf("%.10f", max);
        }
        out.println();

        out.flush();
        out.close();
    }
}