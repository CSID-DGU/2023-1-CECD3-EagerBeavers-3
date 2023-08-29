public class Main{    public static void main(String[] args) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(4 + " " + (n - 4));
        } else {
            System.out.println(9 + " " + (n - 9));
        }
    }
}