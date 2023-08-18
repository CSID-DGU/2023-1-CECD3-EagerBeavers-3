public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int k = in.nextInt();

        A = in.nextInt();

        b = new int[n];
        l = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
            l[i] = in.nextInt();
        }
        masks = new boolean[1 << n];

        max = 0;
        rec(0, k);
        System.out.println(max);
    }
}