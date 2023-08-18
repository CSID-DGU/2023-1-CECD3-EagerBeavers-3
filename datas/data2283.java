public class Main{    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in); //new FileInputStream(new File("CFC.in")));
        //PrintWriter out = new PrintWriter(new File("CFC.out"));
        n = in.nextInt();
        if(n == 1){
            System.out.println(1);
            return;
        }
        dp = new int[n][n+1];
        s = new boolean[n];
        for(int i = 0;i <n; i++)s[i] = in.next().equals("s");
        for(int j = 0;j < n; j++){
            if(s[n-2])dp[n-1][j] = j+1;
            else dp[n-1][j] = 1;
        }
        int suma , sumb;
        for(int i = n-2; i >= 0; i--){
            if(i == 0 ? true : s[i-1]){
                if(s[i]) {
                    for (int j = 0; j < n; j++) {
                        dp[i][j] = ((j == 0 ? 0 : dp[i][j - 1]) + dp[i + 1][j]) % 1000000007;
                    }
                }
                else{
                    for(int j = 0;j < n; j++){
                        dp[i][j] = ((j == 0 ? 0 : dp[i][j-1]) + dp[i+1][j+1]) % 1000000007;
                    }
                }
            }
            else{
                if(s[i]){
                    for(int j = 0;j < n; j++){
                        dp[i][j] = dp[i+1][j];
                    }
                }
                else{
                    for(int j = 0;j < n; j++){
                        dp[i][j] = dp[i+1][j+1];
                    }
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}