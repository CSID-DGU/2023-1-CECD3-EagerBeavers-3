public class Main{    public static void main(String[] args)
    {
        in = new InputReader(System.in);
        out = new PrintWriter(System.out);    
        
        long x = in.nextLong();
        long k = in.nextLong();
        
        if(x == 0){
            out.println(0);
        }
        else{
        
        long mul = pow(2, k + 1, mod);
        x %= mod;
        mul = (mul * x) % mod;
        long sub = pow(2, k, mod);
        sub = (sub - 1 + mod) % mod;
        mul = (mul - sub + mod) % mod;
        out.println(mul);
        }
        
        out.close(); 
    }
}