public class Main{    public static void main(String[] args) {
        try {
            InputStream input = System.in;
            OutputStream output = System.out;
            br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("input.txt"))));
            out = new PrintWriter(new PrintStream(new File("output.txt")));
            solve();
            out.close();
            br.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}