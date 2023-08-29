public class Main{    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        FastScanner in = new FastScanner("input.txt");
//        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        new Task().solve(1, in, out);
        out.close();
    }
}