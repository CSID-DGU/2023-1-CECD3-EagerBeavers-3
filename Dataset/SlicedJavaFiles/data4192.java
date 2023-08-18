public class Main{    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        prob=new double[n][n];
        for(int i=0;i<n;i++) 
            for(int j=0;j<n;j++)
                prob[i][j]=sc.nextDouble();
        dp=new double[1<<n];
        oneCount=new int[1<<n];
        int c;
        for(int i=0;i<dp.length;i++) {
            c=0;
            for(int j=0;j<n;j++) {
                if((i|(1<<j))==i) c++;
            }
            oneCount[i]=c;
        }
        end=(1<<n)-1;
        double res,rad;
        int count;
        for(int k=end;k>0;k--) {
            if(k==end) dp[k]=1;
            else {
                res=0;
                count=oneCount[k];
                count=count*(count+1);
                count>>=1;
                rad=1.0/count;
                //System.out.println(rad+" "+count);
                for(int i=0;i<n;i++) {
                    if((k|(1<<i))!=k) continue;
                    for(int j=0;j<n;j++) {
                        //
                        if((k|(1<<j))==k) continue;
                        //System.out.println(i+" "+j+" "+prob[i][j]+" "+Integer.toBinaryString(mask)+" "+oneC+" "+zeroC);
                        res+=rad*prob[i][j]*dp[k|(1<<j)];
                    }
                }
                dp[k]=res;
            }
        }
        //Arrays.fill(dp, -1);
        for(int i=0;i<n;i++)
            System.out.print(dp[1<<i]+" ");
            //System.out.print(solve(1<<i)+" ");
//      for(int i=0;i<18;i++){
//          for(int k=0;k<18;k++)
//              System.out.print(Math.random()+" ");
//          System.out.println();
//      }
    }
}