public class Main{    public static void main (String[] args) throws java.lang.Exception
    {
        Main solver = new Main();
        solver.in = new InputReader(System.in);
        solver.br = new BufferedReader(new InputStreamReader(System.in));
        solver.out = new PrintWriter(System.out);
        solver.solve();
        solver.out.flush();
        solver.out.close();
    }
}