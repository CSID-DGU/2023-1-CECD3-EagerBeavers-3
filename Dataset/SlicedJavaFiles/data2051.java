public class Main{    public static void main(String[] args) throws IOException {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
        // Here is the solution:
        new A().solve();
        out.flush();
    }
}