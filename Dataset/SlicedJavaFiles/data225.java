public class Main{    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long k = sc.nextLong();
        if(x>0) {
            long d= powmod(2,k,m);
            long ans= mulmod(d,2,m)%m;
            ans= mulmod(ans,x,m)%m;
            ans++;
            ans%=m;
            ans= (ans-d+m)%m;
            System.out.println(ans);
        }
        else
            System.out.println(0);
    }
}