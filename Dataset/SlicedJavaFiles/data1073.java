public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            BigInteger k = sc.nextBigInteger();
            int ans = ss(n, k);
            if (ans == -1) {
                System.out.println("NO");
            } else {
                System.out.println("YES " + ans);
            }
        }
    }
}