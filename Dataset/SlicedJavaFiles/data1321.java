public class Main{    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        long x = scanner.nextLong();
        long k = scanner.nextLong();
        if (x==0) {
            System.out.println("0");
            return;
        }
        BigInteger M = BigInteger.valueOf(1000_000_000L+7);
        BigInteger modus = BigInteger.valueOf(x).multiply(BigInteger.valueOf(2)).subtract(BigInteger.ONE).mod(M);
        BigInteger operandi = BigInteger.valueOf(2).modPow(BigInteger.valueOf(k), M);
        BigInteger result = modus.multiply(operandi).mod(M).add(BigInteger.ONE).mod(M);
        System.out.println(result);
    }
}