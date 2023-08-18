public class Main{  public static void main(String... args) throws Exception {
    br = new BufferedReader(new InputStreamReader(System.in));
    pw = new PrintWriter(new BufferedOutputStream(System.out));
    new P701A().run();
    br.close();
    pw.close();
    System.err.println("\n[Time : " + (System.currentTimeMillis() - startTime) + " ms]");
  }
}