public class Main{    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        right=new int[n][m-1];
        down=new int[n-1][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m-1;j++)
                right[i][j]=sc.nextInt();
        for(int i=0;i<n-1;i++)
            for(int j=0;j<m;j++)
                down[i][j]=sc.nextInt();
        if(k%2==1) {
            for(int i=0;i<n;++i) {
                for (int j = 0; j < m; j++)
                    System.out.print(-1 + " ");
                System.out.println();
            }
        }
        else
        {
            k/=2;
            dp=new int[n][m][k+1];
            for(int i=0;i<n;++i)
                for(int j=0;j<m;j++)
                    for(int z=1;z<=k;z++)
                        dp[i][j][z]=-1;
            for(int i=0;i<n;++i)
                for(int j=0;j<m;j++)
                    recur(i,j,k);
            for(int i=0;i<n;++i) {
                for (int j = 0; j < m; j++)
                    System.out.print((dp[i][j][k] * 2) + " ");
                System.out.println();
            }
        }
    }
}