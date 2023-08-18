public class Main{    public static void main(String[] args)
    {TWO = new BigInteger("2");
        Scanner in = new Scanner(System.in);
        n = new BigInteger(in.next());
        BigInteger x = new BigInteger(in.next());
        BigInteger y = new BigInteger(in.next());
        BigInteger c = new BigInteger(in.next());

        
        BigInteger left = new BigInteger("0");
        BigInteger right = new BigInteger("1000000000000");
        while(left.compareTo(right) < 0)
        {
            BigInteger val = left.add(right).divide(TWO);

            if(solve(x, y, val).compareTo(c) >= 0)
                right = val;
            else
                left = val.add(BigInteger.ONE);
        }

        System.out.println(left);
    } 
}