public class Main{    public static void main(String[] args) throws IOException {
        solver.withProcedure(() -> {
            String[] input = solver.readString().split(" ");
            BigInteger x = new BigInteger(input[0]);
            BigInteger k = new BigInteger(input[1]);

            if (x.compareTo(BigInteger.ZERO) == 0) {
                solver.println("" + 0);
                return;
            }

            BigInteger two = BigInteger.valueOf(2);

            BigInteger mm = BigInteger.valueOf(m);
            BigInteger binpowedK = two.modPow(k, mm);
            BigInteger binpowedKPlusOne = two.modPow(k.add(BigInteger.ONE), mm);

            BigInteger res = binpowedKPlusOne.multiply(x).subtract(binpowedK.subtract(BigInteger.ONE)).mod(mm);

            if (res.compareTo(BigInteger.ZERO) < 0) {
                res = BigInteger.ZERO;
            }

            solver.println("" + res);
        }).solve();
    }
}