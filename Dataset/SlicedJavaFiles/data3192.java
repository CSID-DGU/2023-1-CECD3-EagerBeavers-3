public class Main{    public static void main(String[] args) { 
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);

        Application solver = new Application();
        solver.solve(System.in, out);

        out.close();
    }
}