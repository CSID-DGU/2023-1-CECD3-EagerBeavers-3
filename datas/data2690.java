public class Main{    public static void main(String args[]) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        IntStream.range(0, 1).forEach(tc -> {
            new Solver(tc, in, out).solve();
            out.flush();
        });
        out.close();
    }
}