public class Main{    public static void main(String[] args) throws Throwable {
//      Thread t = new Thread(null, new Main(), "1", 1 << 27);
//      t.start();
//      t.join();
        new Main().run();
        if (sError instanceof OutOfMemoryError) {
            throw sError;
        }
//      if (sError != null) {
//          throw sError;
//      }
    }
}