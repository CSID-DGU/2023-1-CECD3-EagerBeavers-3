public class Main{    public static void main(String[] z) throws Exception{
        Scanner s = new Scanner(System.in);
        long a = s.nextLong(), b=s.nextLong(), c=(a*2-1)%mod, i=binpow(2,b)%mod;
        System.out.println(a<1 ? a : (c*i+1)%mod);
    }
}