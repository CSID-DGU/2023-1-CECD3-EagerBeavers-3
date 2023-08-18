public class Main{    public static void main(String[] args) throws FileNotFoundException
    {
        in = new FastReader();
        out = new PrintWriter(new File("output.txt"));
        solve();
        out.close();
    }
}