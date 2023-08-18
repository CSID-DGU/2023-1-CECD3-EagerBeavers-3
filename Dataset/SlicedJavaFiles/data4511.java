public class Main{    public static void main(String[] args) throws Exception{
        String st[]=nl();
        n=pi(st[0]);
        m=pi(st[1]);
        st=nl();
        String str=st[0];
        int mn=10000;
        for(int i=0;i<n;i++){
            mn=Math.min(mn,str.charAt(i));
        }
        cost=new long[m][m];
        for(int i=1;i<n;i++){
            int a1=str.charAt(i-1)-mn;
            int a2=str.charAt(i)-mn;
            if(a1==a2)continue;
            cost[a1][a2]++;
            cost[a2][a1]++;
        }
        int mm=1<<m;
        dp=new long[mm];
        Arrays.fill(dp,Long.MAX_VALUE/2);
        dp[0]=0;
        //debug(cost);
        long cntbit[]=new long[mm];
        int minbit[]=new int[mm];

        for(int mask=1;mask<mm;mask++){
            cntbit[mask]=1+cntbit[(mask&(mask-1))];
            for(int i=0;i<m;i++){
                if(((mask>>i)&1)!=0){
                    minbit[mask]=i;
                    break;
                }
            }
        }
        long cntcost[][]=new long[mm][m];
        for(int mask=0;mask<mm;mask++){
            for(int i=0;i<m;i++){
                int b=minbit[mask];
                cntcost[mask][i]=cntcost[mask^(1<<b)][i]+cost[i][b];
            }
        }
        int yy=mm-1;
        for(int mask=0;mask<mm;mask++){
            long cnt=cntbit[mask];
            for(int i=0;i<m;i++){
                if(((mask>>i)&1)!=0){
                    long ans=cnt*(cntcost[mask][i]-cntcost[yy^mask][i]);
                    dp[mask]=Math.min(dp[mask],dp[mask^(1<<i)]+ans);
                }
            }
        }
        out.println(dp[mm-1]);
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
}