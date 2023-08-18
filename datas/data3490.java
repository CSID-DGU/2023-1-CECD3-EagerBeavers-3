public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder st = new StringBuilder();
        int t = 1;
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int MOD = sc.nextInt();

            long[] factorial = new long[1000];
            long[] powerOfTwo = new long[1000];
            factorial[0]=1;
            powerOfTwo[0]=1;
            for (int i=1;i<1000;i++) {
                factorial[i]=i*factorial[i-1];
                factorial[i] %= MOD;
                powerOfTwo[i]=2*powerOfTwo[i-1];
                if (powerOfTwo[i]>=MOD) {
                    powerOfTwo[i]-=MOD;
                }
            }
            long[] oneOverFactorial = new long[500];
            oneOverFactorial[0]=1;
            oneOverFactorial[1]=1;
            for (int i=2;i<450;i++) {
                oneOverFactorial[i] = fastPow(factorial[i],MOD-2,MOD);
            }
            long dp[][] = new long[n+3][n+3]; // first value number of computers considered
                                // second value number of computers manually on
            
            dp[1][1]=1;
            for (int i=2;i<=n;i++) { // from left to right, over first i computers
                dp[i][i]=powerOfTwo[i-1];
                for (int j=1;j<i-1;j++) { // number of computers turned on manually
                    for (int k=1;k<=j;k++) {
                        // want to add dp[j][k]*factorial[k+(i-j-1)]*oneOverFactorial[k]*oneOverFactorial[i-j-1]*powerOfTwo[i-j-2]
                        long add = dp[j][k]*factorial[k+(i-j-1)];
                        add %= MOD;
                        add *= oneOverFactorial[k];
                        add %= MOD;
                        add *= oneOverFactorial[i-j-1];
                        add %= MOD;
                        add *= powerOfTwo[i-j-2];
                        add %= MOD;
                        dp[i][k+(i-j-1)]+=add;
                        dp[i][k+(i-j-1)]%=MOD;
                    }
                }
            }
            long ans = 0;
            for (int i=1;i<=n;i++) {
                ans+=dp[n][i];
            }
            ans %= MOD;
            System.out.println(ans);
        }
        
        //System.out.print(st.toString());
    }
}