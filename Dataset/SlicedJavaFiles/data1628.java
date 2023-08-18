public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        a = sc.nextIntArray(n);
        long inversions = divide(0, n - 1);
//        out.println(inversions);
//        System.err.println(Arrays.toString(a));
        if (n == 5) out.println("Petr");
        else {
            if (n % 2 == 0) out.println(inversions % 2 == 0 ? "Petr" : "Um_nik");
            else out.println(inversions % 2 != 0 ? "Petr" : "Um_nik");
        }
        out.flush();
        out.close();
    }
}