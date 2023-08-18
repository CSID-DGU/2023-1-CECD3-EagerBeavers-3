public class Main{    public static void main(String[] args) throws Throwable {
        Thread t = new Thread(new Main());
        t.start();
        t.join();
        if (sError != null) {
            throw sError;
        }
    }
}