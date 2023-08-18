public class Main{    public static void main(String args[])throws IOException{
        Reader sc=new Reader();
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int i,j;
        int n=sc.nextInt();
        int tt=sc.nextInt();
        int t[]=new int[n];
        int g[]=new int[n];
        int last=0;
        int M=1000000007;
        long sum=0;
        for(i=0;i<n;i++){
            t[i]=sc.nextInt();
            g[i]=sc.nextInt()-1;
        }
        int d[][]=new int[1<<n][4];
        d[0][3]=1;
        for(i=0;i<(1<<n);i++){
            for(last=0;last<4;last++){
                for(j=0;j<n;j++){
                    if(g[j]!=last&&((i&(1<<j)))==0){
                        d[i^(1<<j)][g[j]]=(d[i^(1<<j)][g[j]]+d[i][last])%M;
                        // System.out.println((i|(1<<j))+" "+(g[j])+" "+d[i|(1<<j)][g[j]]);
                    }
                }
            }
            int dur=0;
            for(j=0;j<n;j++){
                if((i&(1<<j))>0){
                    dur+=t[j];
                }
            }
            if(dur==tt){
                // System.out.println(i);
                sum=(sum+d[i][0]+d[i][1]+d[i][2])%M;
            }
        }
        pw.println(sum);
        pw.close();
    }
}