public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger l = sc.nextBigInteger();
        BigInteger r = sc.nextBigInteger();
        
        if (r.subtract(l).compareTo(new BigInteger("2")) == -1) {
            System.out.println("-1");
        } else if (r.subtract(l).compareTo(new BigInteger("2")) == 0 && l.mod(new BigInteger("2")) != BigInteger.ZERO) {
            System.out.println("-1");
        } else if (l.mod(new BigInteger("2")) != BigInteger.ZERO) {
            System.out.println(l.add(BigInteger.ONE) + " " + l.add(BigInteger.ONE).add(BigInteger.ONE) + " " + l.add(BigInteger.ONE).add(BigInteger.ONE).add(BigInteger.ONE));
        } else {
            System.out.println(l + " " + l.add(BigInteger.ONE) + " " + l.add(BigInteger.ONE).add(BigInteger.ONE));
        }
    }
}