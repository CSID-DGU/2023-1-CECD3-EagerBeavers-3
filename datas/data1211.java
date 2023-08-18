public class Main{    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        int n = in.readInt();
        int m = in.readInt();
        int k = in.readInt();
        long wrong = n - m;
        long c = wrong * (k) + k - 1;
        long xk = n - c;
        if (xk <= 0)
            System.out.println((n - wrong) % 1000000009);
        else {
            long x = (long) Math.ceil(xk / (k * 1.0));
            long power = Long.parseLong((BigInteger.valueOf(2).modPow(
                    BigInteger.valueOf(x + 1), BigInteger.valueOf(1000000009))
                    .subtract(BigInteger.valueOf(2))) + "");
            power += 1000000009;
            power %= 1000000009;
            long first = (power * k) % 1000000009;
            // System.out.println(first);
            first += (n - x * k - wrong);
            System.out.println(first % 1000000009);
        }
    }
}