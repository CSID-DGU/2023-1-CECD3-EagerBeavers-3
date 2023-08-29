public class Main{    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in, 1024 * 64));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out, 1024 * 64));
        solve(scan, pw);
        pw.flush();
    }
}