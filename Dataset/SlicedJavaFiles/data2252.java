public class Main{    public static void main(String[] args) {
        new Thread(null, new Main3(), "", 128 * 1024 * 1024).start();
    }
}