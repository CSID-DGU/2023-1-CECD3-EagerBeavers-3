public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        max = 0;
        solve(62, l, r, l, r, 0);
        System.out.println(max);
    }
}