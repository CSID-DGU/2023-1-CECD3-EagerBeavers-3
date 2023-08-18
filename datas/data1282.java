public class Main{    public static void main(String args []){
        long x = nextLong();
        long a = 2, b = nextLong(), c = 1000000000+7;
        long res = 1;
        a %= c;
        if (x==0){
            out.println(0);
            out.flush();
            return;
        }
        for (; b != 0; b /= 2) {
            if (b % 2 == 1)
                res = (res * a) % c;
            a = (a * a) % c;
        }
        BigInteger r = new BigInteger(String.valueOf(res));
        BigInteger y = new BigInteger(String.valueOf(x));
        BigInteger ans = y.multiply(new BigInteger("2")).subtract(new BigInteger("1")).multiply(r).add(new BigInteger("1")).mod(new BigInteger(String.valueOf(c)));
        out.println(ans);
        out.flush();
    }
}