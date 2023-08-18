public class Main{    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
            try (PrintWriter out = new PrintWriter(outputStream)) {
                TaskB solver = new TaskB();
                solver.solve(1, in, out);
            }
    }
}