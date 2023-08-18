public class Main{    public static void main (String[] args) throws IOException {
        boolean online = "true".equals(System.getProperty("ONLINE_JUDGE"));
        if (online) {
            in = new InputReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }
        else {
            in = new InputReader(new FileReader("input.txt"));
            out = new PrintWriter(new File("output.txt"));
        }
        
        new Solution().run();
        
        out.close();
    }
}