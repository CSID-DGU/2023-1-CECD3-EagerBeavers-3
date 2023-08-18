public class Main{    public static void main(String[] args) throws Exception {
        new Thread(null, new Runnable() {
            public void run() {
                try {
                    solveIt();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }, "Main", 1 << 28).start();
    }
}