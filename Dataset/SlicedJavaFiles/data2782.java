public class Main{    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t != 0) {
            int f = scan.nextInt();
            int s = scan.nextInt();
            System.out.println(ops(f, s));
            t--;
        }
    }
}