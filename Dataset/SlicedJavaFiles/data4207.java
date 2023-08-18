public class Main{    public static void main(String[] args) throws FileNotFoundException {
        long start;
        if (debug)
            start = System.nanoTime();
        InputStream inputStream;
        OutputStream outputStream;
        if (useFiles) {
            inputStream = new FileInputStream(fileName + ".in");
            outputStream = new FileOutputStream(fileName + ".out");
        } else {
            inputStream = System.in;
            outputStream = System.out;
        }
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task(in, out);
        solver.solve();
        if(debug)
            out.println((System.nanoTime() - start) / 1e+9);
        out.close();
    }
}