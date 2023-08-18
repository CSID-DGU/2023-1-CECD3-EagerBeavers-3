public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskBR574D2 solver = new TaskBR574D2();
        solver.solve(1, in, out);
        out.close();
    }
}