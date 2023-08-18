public class Main{    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = 0;
        int r = n;
        int ans = 0;
        while (l <= r) {
            int eat = (l + r) >> 1;
            int lastPut = n - eat;
            long totalPut = (long) (lastPut + 1) * lastPut / 2;
            long remain = totalPut - eat;
            if (remain == k) {
                ans = eat;
                break;
            } else if (remain > k)
                l = eat + 1;
            else
                r = eat - 1;
        }
        writer.println(ans);

        writer.close();
    }
}