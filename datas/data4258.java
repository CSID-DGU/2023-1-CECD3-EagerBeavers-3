public class Main{    public static void main(String[] args) {
        scanner = new FastScanner();
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
            result.append("\n");
        }
        System.out.print(result.toString());
    }
}