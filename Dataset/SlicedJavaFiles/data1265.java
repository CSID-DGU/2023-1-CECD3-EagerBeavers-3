public class Main{    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long mod = (long) 1e9 + 7;

        long xx = in.nextLong(), kk = in.nextLong();

        if(xx == 0){
            pw.println(0); pw.close();
            return;
        }

        BigInteger x = BigInteger.valueOf(xx), k = BigInteger.valueOf(kk);

       // long a = bigMod(2, k+1, mod );long b = bigMod(2, k, mod);

        BigInteger MOD = BigInteger.valueOf(mod);
        BigInteger a = BigInteger.valueOf(2).modPow(BigInteger.valueOf(kk+1), MOD);
        BigInteger b = BigInteger.valueOf(2).modPow(BigInteger.valueOf(kk), MOD);


        BigInteger s = (a.multiply(x)).mod(MOD);
        s = s.subtract(b.mod(MOD));
        s = s.add(BigInteger.ONE);
        s = s.mod(MOD);
        s = s.add(MOD);
        s = s.mod(MOD);

       // debug(a, b, x);

       // long s = ((a * x) % mod - b % mod + 1 + mod) % mod;

        pw.println(s);


        pw.close();
    }
}