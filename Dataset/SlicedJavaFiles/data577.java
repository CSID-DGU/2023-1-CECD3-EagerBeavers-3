public class Main{    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = sc.nextInt();
        Set<Long> square = new HashSet<>();
        for (long i = 1; i <= (long) 1e5; i++) square.add(i * i);
        while (t-- > 0) {
            long n = sc.nextLong();
            if ((n % 2 ==0 && square.contains(n / 2))|| (n % 4 == 0 &&square.contains(n / 4))) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.close();
    }
}