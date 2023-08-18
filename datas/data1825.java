public class Main{    public static void main(String[] args) throws IOException {
        long timeout = System.currentTimeMillis();
        boolean CF = System.getProperty("ONLINE_JUDGE") != null;
        PrintWriter _pw = new PrintWriter(System.out);
        BufferedReader _br = new BufferedReader(CF ? new InputStreamReader(System.in) : new FileReader(new File("in.txt")));
        new A(_br, _pw).run();
        if (!CF) {
            _pw.println();
            _pw.println(System.currentTimeMillis() - timeout);
        }
        _br.close();
        _pw.close();
    }
}