public class Main{    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=sc.nextInt();
        a=new int[n];
        g=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            g[i] = sc.nextInt();
        }
        dp=new long[4][1<<(n-1)+1][t+1];
        for(int i=0;i<4;i++)
            for(int j=0;j<1<<(n-1)+1;j++)
                for(int k=0;k<=t;k++)
                    dp[i][j][k]=-1;
        System.out.println(dp(0,0,t));
    }
}