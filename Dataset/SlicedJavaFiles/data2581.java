public class Main{    public static void main(String[] args) throws Throwable {
        Thread thread = new Thread(null, new Main(), "", (1 << 26));
        thread.start();
        thread.join();
        if (Main.uncaught != null) {
            throw Main.uncaught;
        }
    }
}