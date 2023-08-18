public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        sc = new InputReader(inputStream);
        pw = new PrintWriter(outputStream);
        solve();
        pw.close();
    }
}