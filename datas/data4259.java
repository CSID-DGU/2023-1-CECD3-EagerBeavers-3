public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        E1RotateColumnsEasyVersion solver = new E1RotateColumnsEasyVersion();
        solver.solve(1, in, out);
        out.close();
    }
}