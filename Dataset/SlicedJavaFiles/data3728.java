public class Main{    public static void main(String hi[]) throws Exception
    {
        int[] prime = new int[MAX+1];
        for(int d=2; d <= MAX; d++)
            if(prime[d] == 0)
                for(int v=d; v <= MAX; v+=d)
                    if(prime[v] == 0)
                        prime[v] = d;
        FastScanner infile = new FastScanner();
        int T = infile.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[MAX+1];
        int[] ts = new int[MAX+1];
        int time = 0;
        while(T-->0)
        {
            int N = infile.nextInt();
            int K = infile.nextInt();
            int[] arr = infile.nextInts(N);
            for(int i=0; i < N; i++)
            {
                int key = 1;
                while(arr[i] > 1)
                {
                    int p = prime[arr[i]];
                    int cnt = 0;
                    while(arr[i]%p == 0)
                    {
                        arr[i] /= p;
                        cnt ^= 1;
                    }
                    if(cnt == 1)
                        key *= p;
                }
                arr[i] = key;
            }
            int[][] right = new int[N][K+1];
            for(int k=0; k <= K; k++)
            {
                int dex = 0;
                int cnt = 0;
                for(int i=0; i < N; i++)
                {
                    while(dex < N && cnt <= k)
                    {
                        if(ts[arr[dex]] == time && freq[arr[dex]] >= 1 && cnt+1 > k)
                            break;
                        if(ts[arr[dex]] == time && freq[arr[dex]] >= 1)
                            cnt++;
                        if(ts[arr[dex]] < time)
                        {
                            ts[arr[dex]] = time;
                            freq[arr[dex]] = 0;
                        }
                        freq[arr[dex]]++;
                        dex++;
                    }
                    right[i][k] = dex;
                    if(freq[arr[i]] >= 2)
                        cnt--;
                    freq[arr[i]]--;
                }
                time++;
            }
            int[][] dp = new int[N+1][K+1];
            for(int i=1; i <= N; i++)
                Arrays.fill(dp[i], N);
            for(int i=0; i < N; i++)
                for(int a=0; a <= K; a++)
                {
                    dp[i+1][a] = min(dp[i+1][a], dp[i][a]+1);
                    for(int b=0; b <= K-a; b++)
                        dp[right[i][b]][a+b] = min(dp[right[i][b]][a+b], dp[i][a]+1);
                }
            int res = dp[N][0];
            for(int k=1; k <= K; k++)
                res = min(res, dp[N][k]);
            sb.append(res+"\n");
        }
        System.out.print(sb);
    }
}