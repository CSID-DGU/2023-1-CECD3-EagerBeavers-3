public class Main{    public static void main(String[] args)
    {
        try
        {
            Parserdoubt pd=new Parserdoubt(System.in);
            PrintWriter pw=new PrintWriter(System.out);
            int fishes=pd.nextInt();
            arr=new double[fishes][fishes];
            for(int i=0;i<fishes;i++)
                for(int j=0;j<fishes;j++)
                    arr[i][j]=Double.parseDouble(pd.nextString());
            double dp[]=new double[(1<<fishes)];
            dp[dp.length-1]=1.0;
            for(int c=dp.length-1;c>=0;c--)
            {
                
                if((c&(c-1))==0)
                    continue;
                for(int i=0;i<fishes;i++)
                    for(int j=i+1;j<fishes;j++)
                    {
                        if(((1<<i)&c)!=0&&((1<<j)&c)!=0)
                        {
                            dp[c&~(1<<j)]+=arr[i][j]*dp[c];
                            dp[c&~(1<<i)]+=arr[j][i]*dp[c];
                        }
                    }
            }
            double s=0.0;
            for(int i=0;i<fishes;i++)
                s+=dp[1<<i];
            for(int i=0;i<fishes;i++)
                dp[1<<i]/=s;
            int i=0;
            for(i=0;i<fishes-1;i++)
                pw.printf("%.6f ",dp[1<<i]);
            pw.printf("%.6f\n",dp[1<<i]);
            pw.close();
        }
        catch(Exception e)
        {}
    }
}