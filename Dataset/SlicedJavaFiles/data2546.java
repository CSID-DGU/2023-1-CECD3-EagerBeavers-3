public class Main{    public static void main(String[] args) throws NumberFormatException, IOException
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        int tc = in.nextInt();
        for(int i = 0; i < tc; i++)
            solver.solve(i, in, out);
        out.close();
    }
}