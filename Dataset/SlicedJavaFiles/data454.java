public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ACodehorsesTShirts solver = new ACodehorsesTShirts();
        solver.solve(1, in, out);
        out.close();
    }
}