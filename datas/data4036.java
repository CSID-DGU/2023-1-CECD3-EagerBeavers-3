public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskG1 solver = new TaskG1();
        solver.solve(1, in, out);
        out.close();
    }
}