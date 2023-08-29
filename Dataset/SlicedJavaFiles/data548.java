public class Main{  public static void main(String[] args) {
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    Solver1515B solver = new Solver1515B();
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      solver.solve(i, in, out);
    }
    out.close();
  }
}