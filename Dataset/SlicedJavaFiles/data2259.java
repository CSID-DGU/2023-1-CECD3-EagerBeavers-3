public class Main{    public static void main(String[] args) {

        MyScanner in = new MyScanner();
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        char prev = ' ';

        // index, maxNumOfIntents -> count
        int[][] dp = new int[n+1][n+2];

        dp[0][0] = 1;
        for(int i=0;i<n;++i){
            char ch = in.next().charAt(0);
            if(prev == 's'){
                int sum = 0;
                for(int j=n;j>=0;--j){
                    sum = (sum + dp[i-1][j]) % MOD;
                    dp[i][j] = sum;
                }
            }else if(prev == 'f'){
                for(int j=0;j<n;++j){
                    dp[i][j+1] = dp[i-1][j];
                }
            }

            prev = ch;
        }

        int result = 0;
        for(int i=0;i<=n;++i){
            result = (result + dp[n-1][i]) % MOD;
        }


        out.println(result);
        out.close();

    }
}