public class Main{    public static void main(String[] args) throws NumberFormatException,
            IOException {
        Solver solver = new Solver();
        solver.open();
        long time = System.currentTimeMillis();
        solver.solve();
        if (!"true".equals(System.getProperty("ONLINE_JUDGE"))) {
            System.out.println("Spent time: "
                    + (System.currentTimeMillis() - time));
        }
        solver.close();
    }
}