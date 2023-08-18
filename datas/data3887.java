public class Main{    public static void main(String[] args) {
        new Thread(null, null, "_", 1 << 27) {
            public void run() {
                try {
                    solve();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }.start();
    }
}