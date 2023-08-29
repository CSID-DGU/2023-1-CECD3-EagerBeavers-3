public class Main{    public static void main(String args[]) throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        long x=in.nextLong();
        long k=in.nextLong();
        
        long ans=mod_exp(2,k+1);
        ans*=(x%mod);
        ans%=mod;
        ans-=mod_exp(2,k);
        ans%=mod;
        ans++;
        ans%=mod;
        if(ans<0)
            ans+=mod;
        if(x==0)
            ans=0;
        out.println(ans);
        out.close();
    }
}