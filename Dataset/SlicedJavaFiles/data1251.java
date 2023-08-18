public class Main{    public static void main(String[] args) throws IOException {
        init(System.in);
        BigInteger x = new BigInteger(next());
        if (x.compareTo(BigInteger.ZERO) == 0) {
            System.out.println(0);
            return;
        }
        BigInteger k = new BigInteger(next());
        BigInteger mod = new BigInteger("1000000007");
        BigInteger two = BigInteger.ONE.add(BigInteger.ONE);
        BigInteger ans = two.modPow(k, mod);
        ans = ans.multiply(two.multiply(x).subtract(BigInteger.ONE)).add(BigInteger.ONE).mod(mod);
        System.out.println(ans);
    }
}