public class Main{    public static void main(String[] args) throws NumberFormatException,
            IOException {
        Solver solver = new Solver();
        solver.open();
        solver.solve();
        solver.close();
    }
}