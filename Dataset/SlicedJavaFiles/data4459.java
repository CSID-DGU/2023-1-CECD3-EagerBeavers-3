public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E1RotateColumnsEasyVersion solver = new E1RotateColumnsEasyVersion();
        solver.solve(1, in, out);
        out.close();
    }
}