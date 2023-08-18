public class Main{    public static void main(String[] args) throws NumberFormatException,
            IOException {
        taskB solver = new taskB();
        solver.open();
        long time = System.currentTimeMillis();
        solver.solve();
        if (!"true".equals(System.getProperty("ONLINE_JUDGE"))) {
            System.out.println("Spent time: "
                    + (System.currentTimeMillis() - time));
            System.out.println("Memory: "
                    + (Runtime.getRuntime().totalMemory() - Runtime
                    .getRuntime().freeMemory()));
        }
        solver.close();
    }
}