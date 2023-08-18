public class Main{    public static void main(String args[]) throws IOException {
        Main solver;
        if (!"true".equals(System.getProperty("ONLINE_JUDGE"))) {
            solver = new Main("input.txt");
        } else {
            solver = new Main();
        }
        solver.solve();
        solver.close();
    }
}