public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l = sc.nextLong();
        r = sc.nextLong();
        if (found(l, l + 1, l + 2))
            System.out.println(A + " " + B + " " + C);
        else
            System.out.println(-1);
    }
}