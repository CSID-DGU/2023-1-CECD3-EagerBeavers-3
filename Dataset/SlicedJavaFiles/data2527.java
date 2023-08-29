public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F2SameSumBlocksHard solver = new F2SameSumBlocksHard();
        solver.solve(1, in, out);
        out.close();
    }
}