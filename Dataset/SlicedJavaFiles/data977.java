public class Main{    public static void main(String[] args) {
        new Thread(null, new Main(), "Check2", 1 << 28).start();// to increse stack size in java
    }
}