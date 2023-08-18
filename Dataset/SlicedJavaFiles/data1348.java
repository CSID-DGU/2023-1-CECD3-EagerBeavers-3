public class Main{    public static void main(String[] args) {
        new Thread(null, new Template(), "", 1l * 200 * 1024 * 1024).start();
    }
}