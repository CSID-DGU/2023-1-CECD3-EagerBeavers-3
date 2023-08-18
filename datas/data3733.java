public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        SquareFreeDivisionHardVersion solver = new SquareFreeDivisionHardVersion();
        solver.solve(1, in, out);
        out.close();
    }
}