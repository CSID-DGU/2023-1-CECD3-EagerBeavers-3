public class Main{    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        int n = r.nextInt();
        
        double[][] g = new double[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                g[i][j] = r.nextDouble();
        
        dp = new double[1 << n];
        P = new double[1 << n][n];
        for(int mask = 0; mask < 1 << n; mask++){
            for(int d = 0; d < n; d++)if((mask & (1 << d)) == 0)
                for(int i = 0; i < n; i++)if((mask & (1 << i)) == 0){
                    if(i == d)continue;
                    
                    P[mask][d] += g[i][d];
                }
        }
        
        for(int i = 0; i < n; i++){
            Arrays.fill(dp, -1);
            
            double res = go(i, 0, g, n, n);
            System.out.println(res);
        }
    }
}