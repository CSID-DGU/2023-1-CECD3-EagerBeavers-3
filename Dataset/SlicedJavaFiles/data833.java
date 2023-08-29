public class Main{    public static void main (String[] args) throws IOException {
        BitSet b = new BitSet(1001);
        BitSet p = primes(1001);
        for (int i = 0; i < ps.length - 1; i++) {
            b.set(ps[i] + ps[i+1] + 1);
        }
        int n = sc.nextInt(), k = sc.nextInt();
        for (int x = 0; x <= n; x++) {
            if (b.get(x) && p.get(x)) k--;
        }
        System.out.println(k > 0 ? "NO" : "YES");
    }
}