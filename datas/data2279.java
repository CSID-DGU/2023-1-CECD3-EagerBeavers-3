public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C909 solver = new C909();
        solver.solve(1, in, out);
        out.close();
    }
}