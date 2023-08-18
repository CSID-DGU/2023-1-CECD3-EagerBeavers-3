public class Main{    public static void main(String hi[]) throws Exception
    {
        FastScanner infile = new FastScanner();
        int N = infile.nextInt();
        int M = infile.nextInt();
        int K = infile.nextInt();
        int[][] weights1 = new int[N][M-1];
        for(int r=0; r < N; r++)
            weights1[r] = infile.nextInts(M-1);
        int[][] weights2 = new int[N-1][M];
        for(int r=0; r < N-1; r++)
            weights2[r] = infile.nextInts(M);
        //all are -1 if K is odd
        int[][] res = new int[N][M];
        if(K%2 == 1)
        {
            StringBuilder sb = new StringBuilder();
            for(int r=0; r < N; r++)
            {
                for(int c=0; c < M; c++)
                    sb.append("-1 ");
                sb.append("\n");
            }
            System.out.print(sb);
            return;
        }
        int[][] dp = new int[N][M];
        StringBuilder sb = new StringBuilder();
        for(int k=0; k < K/2; k++)
        {
            int[][] next = new int[N][M];
            for(int r=0; r < N; r++)
                Arrays.fill(next[r], INF);
            for(int r=0; r < N; r++)
                for(int c=0; c < M; c++)
                {
                    if(r > 0)
                        next[r-1][c] = min(next[r-1][c], dp[r][c]+weights2[r-1][c]);
                    if(r+1 < N)
                        next[r+1][c] = min(next[r+1][c], dp[r][c]+weights2[r][c]);
                    if(c > 0)
                        next[r][c-1] = min(next[r][c-1], dp[r][c]+weights1[r][c-1]);
                    if(c+1 < M)
                        next[r][c+1] = min(next[r][c+1], dp[r][c]+weights1[r][c]);
                }
            dp = next;
        }
        for(int r=0; r < N; r++)
        {
            for(int x: dp[r])
                sb.append((2*x)+" ");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}