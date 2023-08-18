public class Main{  public static void main(String[] args) {
    try {
      in = new BufferedReader(new InputStreamReader(System.in));
      out = new PrintWriter(System.out);
      solve();
      out.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}