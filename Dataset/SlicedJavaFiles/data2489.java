public class Main{    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F1BlokiRavnoiSummiProstayaRedakciya solver = new F1BlokiRavnoiSummiProstayaRedakciya();
        solver.solve(1, in, out);
        out.close();
    }
}