public class Main{    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        Reader in = new Reader();
        Main solver = new Main();
        solver.solve(out, in);
        out.flush();
        out.close();
 
    }
}