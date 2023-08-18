public class Main{          public static void main(String[] args) throws IOException
          { 
                new Thread(null, new Sample(), "whatever", 1<<26).start();
          }
}