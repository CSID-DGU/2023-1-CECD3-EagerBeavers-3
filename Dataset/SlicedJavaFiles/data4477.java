public class Main{    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EKeyboardPurchase solver = new EKeyboardPurchase();
        solver.solve(1, in, out);
        out.close();
    }
}