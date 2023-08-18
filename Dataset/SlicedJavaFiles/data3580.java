public class Main{  public static void main(String... args) throws Exception {
    br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
    pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("output.txt")));
    new P35C().run();
    br.close();
    pw.close();
    System.err.println("\n[Time : " + (System.currentTimeMillis() - startTime) + " ms]");
  }
}