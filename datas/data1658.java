public class Main{    public static void main(String[] args) {
        new Thread(null, new Solution(), "", 1 << 25).start();
    }
}