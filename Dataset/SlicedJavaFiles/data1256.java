public class Main{    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        long N,K,ans;
        
        //System.out.println(); //comment this line
        String s[]=br.readLine().trim().split(" ");
        
        N=Long.parseLong(s[0]);
        K=Long.parseLong(s[1]);
        
        BigInteger bi=new BigInteger(N+"");
        BigInteger a=new BigInteger(N+"");
        BigInteger two=new BigInteger(2+"");
        
        if(N==0)
        {
            System.out.println(0);
            System.exit(0);
        }
        if(K==0)
        {
            a=a.multiply(two);
            a=a.mod(m);
            
            System.out.println(a);
            System.exit(0);
        }
        
        long p=pow(2,K);
        
        BigInteger p2=new BigInteger(p+"");
        BigInteger tmp=p2.subtract(BigInteger.ONE);
        tmp=tmp.mod(m);
        
        p2=p2.multiply(two);
        p2=p2.mod(m);
        
        a=a.multiply(p2);
        a=a.mod(m);
        
        a=a.subtract(tmp);
        a=a.mod(m);
        
        if(!(a.signum()==1)&&!(a.signum()==0))
        a.add(m);
        
        System.out.println(a);
    }
}