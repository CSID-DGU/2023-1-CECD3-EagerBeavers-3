public class Main{    public static void main(String hi[]) throws Exception
    {
        BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(infile.readLine());
        int N = Integer.parseInt(st.nextToken());
        MOD = Long.parseLong(st.nextToken());
        fac = new long[401];
        invfac = new long[401];
        fac[0] = invfac[0] = 1L;
        for(int i=1; i <= 400; i++)
        {
            fac[i] = (fac[i-1]*i)%MOD;
            invfac[i] = power(fac[i], MOD-2, MOD);
        }
        long[] pow2 = new long[401];
        for(int i=0; i <= 400; i++)
            pow2[i] = power(2, i, MOD);
        long[][] dp = new long[N+1][N+1];
        for(int v=1; v <= N; v++)
        {
            dp[v][v] = pow2[v-1];
            for(int k=1; k <= v; k++)
                for(int block=1; block <= k; block++)
                {
                    if(block == v)
                        continue;
                    long temp = (dp[v-block-1][k-block]*calc(k-block, block))%MOD;
                    temp = (temp*pow2[block-1])%MOD;
                    dp[v][k] += temp;
                    if(dp[v][k] >= MOD)
                        dp[v][k] -= MOD;
                }
        }
        long res = 0L;
        for(int v=1; v <= N; v++)
        {
            res += dp[N][v];
            if(res >= MOD)
                res -= MOD;
        }
        System.out.println(res);
    }
}