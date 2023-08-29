public class Main{    public static void main(String[] args) {
            long x = in.nextLong();
            long k = in.nextLong();
            long mod = (long)1e9+7l;
            //out.println(mod);
            long mul1 = 1;
            long mul2 = 2*x-1;
            mul2 = mul2%mod;
            long pow = k;
            long to = 2;
            while(pow>0l){
                if(pow%2l==1l){
                    mul1 = mul1*to;
                    mul1%=mod;
                }
                to=to*to;
                to%=mod;
                pow = pow/2l;
            }
            mul1 = mul1*mul2;
            mul1%=mod;
            mul1+=1;
            if(x!=0)
            out.println(mul1%mod);
            else
            out.println(0);
        
        out.close();    
    }
}