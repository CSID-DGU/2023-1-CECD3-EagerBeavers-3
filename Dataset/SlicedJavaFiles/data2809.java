public class Main{    public static void main(String[] args) {
        InputReader r = new InputReader(System.in);
        int n = r.nextInt();
        while (n-- > 0) {
            int a = r.nextInt();
            int b = r.nextInt();
            int res = 0;
            while (a > 0 && b > 0) {
                if (a > b) {
                    int div = a / b;
                    a -= div * b;
                    res += div;
                } else {
                    int div = b / a;
                    b -= div * a;
                    res += div;
                }
            }
            System.out.println(res);
        }
    }
}