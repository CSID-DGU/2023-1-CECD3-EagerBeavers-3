public class Main{    public static void main(String[] args) throws Exception{
        Reader.init(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Main mm =new Main();
        int n=Reader.nextInt();
        int m=Reader.nextInt();
        String s=Reader.next();
        int[][] count=new int[m][m];
        for(int i=1;i<n;i++) {
            count[s.charAt(i)-'a'][s.charAt(i-1)-'a']++;
            count[s.charAt(i-1)-'a'][s.charAt(i)-'a']++;
        }
        int[] dp=new int[1<<m];
        Arrays.fill(dp, Integer.MAX_VALUE/10);
        for(int i=0;i<m;i++) {
            dp[1<<i]=0;
        }
        for(int i=0;i<(1<<m);i++) {
            int extra=0;
            for(int j=0;j<m;j++) {
                if((i&(1<<j))>0) {
                for(int k=0;k<m;k++) {
                    if(j!=k &&  (i&(1<<k))==0) {
                        extra+=count[j][k];
                    }
                }
               }
            }
            for(int j=0;j<m;j++) {
                if((i&(1<<j))==0) {
                    dp[i|(1<<j)]=Math.min(dp[i|(1<<j)], dp[i]+extra);
                }
            }
        }
        out.println(dp[(1<<m)-1]);
        out.close();
}
}