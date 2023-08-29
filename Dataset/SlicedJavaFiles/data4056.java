public class Main{    public static void main (String[] args) throws Exception {
        String st[]=nl();
        n=pi(st[0]);
        T=pi(st[1]);
        input=new int[n];
        type=new int[n];
        for(int i=0;i<n;i++){
            st=nl();
            input[i]=pi(st[0]);
            type[i]=pi(st[1]);
        }
        dp=new long[1<<n][4];
        for(long arr[]:dp)
            Arrays.fill(arr,-1);
        long ans=dfs(0,0);
       // debug(dp);

        out.println(ans);
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
}