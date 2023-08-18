public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Reader in = new Reader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BDigitsSequenceHardEdition solver = new BDigitsSequenceHardEdition();
        solver.solve(1, in, out);
        out.close();
    }
}