public class Main{    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("1"));
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        in.close();
        out.close();
    }
}