public class Main{    public static void main(String[] args) {
        scanner = new FastScanner();
        long n = scanner.nextInt();
        long k = scanner.nextInt();

        if (sum(n) == k) {
            System.out.println(0);
            return;
        }

        long s = 0;
        long e = n + 1;
        while (s < e - 1) {
            long m = (s + e) / 2;
            long put = sum(n - m);
            long candiesLeft = put - m;
            if (candiesLeft == k) {
                System.out.println(m);
                return;
            }
            if (candiesLeft > k) {
                s = m;
            } else {
                e = m;
            }
        }
    }
}