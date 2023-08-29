public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ReaderFastIO in = new ReaderFastIO(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DConcatenatedMultiples solver = new DConcatenatedMultiples();
        solver.solve(1, in, out);
        out.close();
    }
}