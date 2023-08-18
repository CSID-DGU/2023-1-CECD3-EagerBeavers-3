public class Main{    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
//        Scanner scan = new Scanner(System.in);
//for (int i = 1; i <= 10; i++) {
//    System.out.println(i + " " + divisors(i).toString());
//}   
        int tc = sc.ni();
        for (int rep = 0; rep < tc; rep++) {
            long n = sc.nl();
            if (n % 2 == 1) {
                pw.println("NO");
            }
            else {
                n/= 2;
                if (perfectSquare(n)) {
                    pw.println("YES");
                }
                else if (n % 2 == 0 && perfectSquare(n/2)) {
                    pw.println("YES");
                }
                else {
                    pw.println("NO");
                }
            }
        }
        pw.close();
    }
}