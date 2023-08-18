public class Main{    public static void main(String args[]) {
        new Thread(null, new Main(), "Main", 1 << 28).start();
    }
}