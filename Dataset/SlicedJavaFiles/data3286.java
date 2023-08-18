public class Main{    public static void main(String[] args) {
        InputStream in = System.in;
        OutputStream out = System.out;
        InputReader reader = new InputReader(in);
        PrintWriter writer = new PrintWriter(out);
        solve(reader, writer);
        writer.close();
    }
}