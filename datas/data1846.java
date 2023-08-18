public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGlassCarving solver = new CGlassCarving();
        solver.solve(1, in, out);
        out.close();
    }
}