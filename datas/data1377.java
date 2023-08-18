public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong() - 1, k = sc.nextLong() - 1;

        int a = 0;
        if ((k + 1) * k / 2 < n) {
            System.out.println(-1);
            return;
        }
        while (n > 0 && k > 0) {
            long min = go(n, k);
            a += (k - min + 1);
            n -= (k + min) * (k - min + 1) / 2;
            k = Math.min(min - 1, n);
        }

        if (n == 0)
            System.out.println(a);
        else
            System.out.println(-1);

    }
}