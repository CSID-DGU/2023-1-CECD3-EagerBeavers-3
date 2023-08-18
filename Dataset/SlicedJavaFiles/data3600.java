public class Main{    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        OutputStream output = System.out;
        InputReader in = new InputReader(new FileReader(new File("input.txt")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        Solution s = new Solution();
        s.solve(1, in, out);
        out.close();
    }
}