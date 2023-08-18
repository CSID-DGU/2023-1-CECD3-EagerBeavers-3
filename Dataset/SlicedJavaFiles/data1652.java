public class Main{    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int testCases = 1;
        Task solver = new Task();
        for (int i = 1; i <= testCases; ++i)
            solver.solve(in, out);

        out.close();
    }
}