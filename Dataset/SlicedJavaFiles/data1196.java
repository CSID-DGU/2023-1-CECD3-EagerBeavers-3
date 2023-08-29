public class Main{  public static void main(String[] args) throws IOException {
    if (DEBUG) {
      generate();
    }
    Solver solver = new Solver();
    solver.readData();
    solver.solveAndPrint();
  }
}