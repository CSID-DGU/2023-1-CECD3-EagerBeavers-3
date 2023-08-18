public class Main{  public static void main(String[] args) {
    try {
      br = new BufferedReader(new InputStreamReader(System.in));
      //br = new BufferedReader(new FileReader("input.txt"));
      out = new PrintWriter(System.out);
      //out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
      new Main().solve();
      out.close();
    } catch (Throwable e) {
      System.out.println(e);
      System.exit(239);
    }
  }
}