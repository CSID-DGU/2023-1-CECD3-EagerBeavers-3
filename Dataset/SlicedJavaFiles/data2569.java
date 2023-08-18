public class Main{    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        TaskC solver = new TaskC(in, out);
        solver.solve();
        out.close();
    }
}