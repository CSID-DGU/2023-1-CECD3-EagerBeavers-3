public class Main{    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ProbB());
        thread.start();
        thread.join();
    }
}