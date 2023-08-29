public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        a = sc.nextInt();
        level = new int[n];
        loyality = new int[n];
        for (int i = 0; i < n; i++) {
            level[i] = sc.nextInt();
            loyality[i] = sc.nextInt() / 10;
        }
        mid = (n/2) +1;
        sol = 0;
        getMax(0, k);
        System.out.println(sol);
    }
}