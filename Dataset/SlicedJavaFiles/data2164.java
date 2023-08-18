public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt(), r = sc.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i++)
            x[i] = sc.nextInt();
        double[] ans = new double[n];
        for(int i = 0; i < n; i++) {
            ans[i] = r;
            for(int j = 0; j < i; j++) {
                int d = Math.abs(x[i] - x[j]);
                if(d > 2 * r)
                    continue;
                int h = 2 * r;
                double yd = Math.sqrt(h * h - d * d);
                ans[i] = Math.max(ans[i], ans[j] + yd);
            }

            out.print(ans[i]);
            if(i == n - 1)
                out.println();
            else
                out.print(" ");
        }

        out.flush();
        out.close();

    }
}