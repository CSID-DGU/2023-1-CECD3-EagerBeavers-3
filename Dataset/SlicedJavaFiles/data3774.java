public class Main{    public static void main(String args[]) throws IOException {
        Scan input=new Scan();
        StringBuilder ans=new StringBuilder("");
        
        n=input.scanInt();
        m=input.scanInt();
        k=input.scanInt();
        
        dp=new int[n][m][k];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                for(int kk=0;kk<k;kk++) {
                    dp[i][j][kk]=-1;
                }
            }
        }
        
        uu=new int[n][m];
        rr=new int[n][m];
        dd=new int[n][m];
        ll=new int[n][m];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m-1;j++) {
                int tmp=input.scanInt();
                rr[i][j]=tmp;
                ll[i][j+1]=tmp;
            }
        }
        
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<m;j++) {
                int tmp=input.scanInt();
                dd[i][j]=tmp;
                uu[i+1][j]=tmp;
            }
        }
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(k%2!=0) {
                    ans.append(-1+" ");
                    continue;
                }
                ans.append((2*solve(i,j,k/2))+" ");
            }
            ans.append("\n");
        }
        
        System.out.println(ans);
    }
}