public class Main{    public static void main(String[] args) {
        // TODO code application logic here
        InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    TaskB solver = new TaskB();
    solver.solve(1, in, out);
    out.close();
    }
}