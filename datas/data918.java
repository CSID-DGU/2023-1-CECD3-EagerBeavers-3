public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt(), k = sc.nextInt();
        long rhs = 2l * (n + k);
        for (int x = 1; ; x++) {
            long lhs = 1l * x * x + 3l * x;
            if (rhs == lhs) {
                out.println(n - x);
                break;
            }
        }
        out.flush();
        out.close();
    }
}