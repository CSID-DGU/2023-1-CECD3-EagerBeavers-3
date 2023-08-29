public class Main{    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(new FileReader("input.txt")); // new InputReader(inputStream);
        PrintWriter out = new PrintWriter("output.txt"); //new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(in, out);
        out.close();
    }
}