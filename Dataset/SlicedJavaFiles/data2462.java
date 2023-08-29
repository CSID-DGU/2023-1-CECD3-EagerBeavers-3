public class Main{    public static void main(String[] args) {
        Thread t = new Thread(null, new O(), "Integer.MAX_VALUE", 100000000);
        t.start();
    }
}