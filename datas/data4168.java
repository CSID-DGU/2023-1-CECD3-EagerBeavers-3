public class Main{    public static void main(String[] args) throws NumberFormatException,
            IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        p = new double[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < n; j++) {
                p[i][j] = Double.parseDouble(st.nextToken());
            }
        }
 
        dp = new double[1 << n];
 
        Arrays.fill(dp, -1.0);
 
        dp[(1 << n) - 1] = 1.;
 
        for (int i = 0; i < n - 1; i++) {
            System.out.print(f(1 << i) + " ");
        }
 
        System.out.println(f((1 << (n - 1))));
 
    }
}