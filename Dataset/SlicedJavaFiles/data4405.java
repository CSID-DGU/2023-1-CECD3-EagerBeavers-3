public class Main{  public static void main(String[] args) throws Exception {
    Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
    thread.start();
    thread.join();
  }
}