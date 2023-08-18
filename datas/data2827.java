public class Main{    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        while (numberOfTests-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int[] res = new int[1];
            compute(a, b, res);
            System.out.println(res[0]);
        }
    }
}