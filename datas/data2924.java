public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("8 " + (n - 8));
        } else {
            System.out.println("9 " + (n - 9));
        }
    }
}