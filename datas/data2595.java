public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        APaintTheNumbers solver = new APaintTheNumbers();
        solver.solve(1, in, out);
        out.close();
    }
}