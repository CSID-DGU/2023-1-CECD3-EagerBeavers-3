public class Main{    public static void main(String[] args) throws Exception {
        File file = new File("System.in");
        InputStream input = System.in;
        PrintStream output = System.out;
        if (file.exists() && file.canRead()) {
            input = new FileInputStream(file);
            output = new PrintStream("System.out");
        }
        br = new BufferedReader(new InputStreamReader(input));
        out = new PrintWriter(output);
        solve();
        out.close();
    }
}