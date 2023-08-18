public class Main{    public static void main(String[] args) {
        new Thread(null, new realfast(), "", 128 * (1L << 20)).start();
    }
}