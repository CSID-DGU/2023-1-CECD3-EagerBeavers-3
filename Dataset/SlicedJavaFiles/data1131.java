public class Main{    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = sc.nextLong();
        
        BigInteger k = findFirst(BigInteger.valueOf(s));
        if (BigInteger.valueOf(n).compareTo(k) >= 0)
        {
            System.out.println(n - k.longValue() + 1);
        }
        else
        {
            System.out.println("0");
        }
    }
}