public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int k = in.nextInt();
        A = in.nextDouble();
        B = new int[n];
        L = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = in.nextInt();
            L[i] = in.nextInt();
        }
        rec(0, k);
        System.out.println(max);
    }
}