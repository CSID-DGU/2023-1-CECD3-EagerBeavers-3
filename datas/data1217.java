public class Main{    public static void main(String[] args) {
        InputReader r = new InputReader(System.in);
        int n = r.nextInt();
        int m = r.nextInt();
        int k = r.nextInt();
        int buckets = n / k;
        int rem = n - buckets * k;
        long low = 0, high = buckets, itr = 30;
        while (itr-- > 0) {
            long mid = (low + high) / 2;
            long correct = mid * k + rem + (buckets - mid) * (k - 1);
            if (correct < m)
                low = mid;
            else
                high = mid;
        }
        long pow = (pow(2, high + 1) - 2 + mod) % mod;
        pow *= k;
        pow %= mod;
        long res = m - (high * k) + pow + 10 * mod;
        res %= mod;
        System.out.println(res);
    }
}