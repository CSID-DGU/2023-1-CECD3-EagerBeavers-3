public class Main{    public static void main(String[] args) throws Exception {
        //String cwd = System.getProperty("user.dir") + "\\";
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        PrintStream out = new PrintStream(System.out);
        //Scanner in = new Scanner(new BufferedInputStream(new FileInputStream(cwd + "src\\code\\in.in")));
        //PrintStream out = new PrintStream(cwd + "src\\code\\out.out");
        //=======================
        Solution solution = new Solution(in, out);
        solution.solve();
        //=======================
        in.close();
        out.close();
    }
}