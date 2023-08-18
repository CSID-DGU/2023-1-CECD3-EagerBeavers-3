public class Main{    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        br = new BufferedReader(new InputStreamReader(input));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
}