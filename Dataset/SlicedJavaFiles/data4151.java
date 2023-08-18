public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        dp = new double[1<<n];
        p = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j]= in.nextDouble();                
            }
        }
        for (int i = 0; i <(1<<n); i++) {
            dp[i] = -1;            
        }
        dp[(1<<n)-1]=1;
        DecimalFormat d = new DecimalFormat("0.000000");
        System.out.print(d.format(f(1<<0)));
        for (int i = 1; i < n; i++) {
            System.out.print(" "+d.format(f(1<<i)));
        }
    }
}