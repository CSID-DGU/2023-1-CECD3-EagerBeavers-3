public class Main{    public static void main(String[] args) throws IOException {
        int n=r.nextInt();
        M=r.nextInt();
        fac[0]=1;
        ifac[0]=1;
        p2[0]=1;
        for(int i=1;i<=n;++i){
            fac[i]=mul(fac[i-1],i);
            ifac[i]=inv(fac[i]);
            p2[i]=mul(p2[i-1],2);
        }
        int ans=0;
        dp[0][0]=1;
        for(int i=0;i<=n;++i){
            for(int k=0;k<=i;++k){
                for(int j=1;j<=n-i+1;++j){
                    dp[i+j+1][k+j]=add(dp[i+j+1][k+j],mul(dp[i][k],mul(p2[j-1],bino(j+k,j))));
                }
            }
        }
        for(int i=0;i<=n+1;++i){
            ans=add(ans,dp[n+1][i]);
        }
        pw.print(ans);
        pw.close();
    }
}