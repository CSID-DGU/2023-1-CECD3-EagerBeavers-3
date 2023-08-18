public class Main{    public static void main(String[] args) {
        check = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = n + "";
        recurse(n, s.length(), "4");
        if (!check)
            System.out.println("YES");
        else {
            recurse(n, s.length(), "7");
            if (!check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}