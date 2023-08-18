public class Main{    public static void main (String[] args) throws Exception {
        String st[]=nl();
        int n=pi(st[0]);
        int input[]=new int[n];
        st=nl();
        for(int i=0;i<n;i++){
            input[i]=pi(st[i]);
        }
        int ans=0;
        Arrays.sort(input);
        boolean dp[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!dp[i]){
                ans++;
                for(int j=input[i];j<=200;j+=input[i]){
                    for(int k=i;k<n;k++){
                        if(input[k]==j&&!dp[k])dp[k]=true;
                    }
                }
            }
        }
        out.println(ans);
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
}