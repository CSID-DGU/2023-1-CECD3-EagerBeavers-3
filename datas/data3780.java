public class Main{    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i;

        String[] s=br.readLine().trim().split(" ");
        N=Integer.parseInt(s[0]);
        M=Integer.parseInt(s[1]);
        K=Integer.parseInt(s[2]);

        edge=new ArrayDeque[N][M];
        for(i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
                edge[i][j]=new ArrayDeque<>();
        }

        w1=new long[N][M-1];
        w2=new long[N-1][M];
        dp=new long[N][M][K/2+1];

        for(i=0;i<N;i++)
        {
            s=br.readLine().trim().split(" ");
            for(int j=0;j<M-1;j++) w1[i][j]=Integer.parseInt(s[j])*2L;
        }
        for(i=0;i<N-1;i++)
        {
            s=br.readLine().trim().split(" ");
            for(int j=0;j<M;j++) w2[i][j]=Integer.parseInt(s[j])*2L;
        }

        for(i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
                Arrays.fill(dp[i][j],-1);
        }

        if(K%2==1)
        {
            K/=2;
            answer();
            System.exit(0);
        }

        K/=2;
        for(i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
                solve(i,j,K);
        }

        answer();
    }
}