public class Main{    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        sb = new StringBuilder();
        n = sc.nextInt();
        TotalTime = sc.nextLong();
        problems = new Problem[n];
        for (int i = 0; i < n; i++) {
            problems[i] = new Problem (sc.nextInt(), sc.nextLong(), i);
        }
        Arrays.sort(problems);
        long num = -1;
        long high = n;
        long low = 0;
        int iter = 0;
        while (high - low > 1) {
            num = (high + low) / 2;
            if (test(num, false)) {
                low = num;
            }
            else {
                high = num;
            }
        }
        if (test(high, false))
            num = high;
        else
            num = low;
        test(num, true);
        System.out.print(sb);
    }
}