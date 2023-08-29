public class Main{    public static void main(String[] args) {
        CIO io = new CIO();
        try {
            Csolver solver = new Csolver(io);
            solver.solve();
        } finally {
            io.close();
        }
    }
}