public class Main{    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(), "Main", 1 << 27).start();
    }
}