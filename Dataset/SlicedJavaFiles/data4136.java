public class Main{    public static void main(String[] args) throws IOException,
            InterruptedException {
        Thread th = new Thread(null, new Solution(), "", 536870912);
        th.start();
        th.join();
    }
}