public class Main{    public static void main(String[] args) throws IOException { 
        //InputStream input = System.in;
        //OutputStream output = System.out;
        InputReader in = new InputReader(new FileReader(new File("input.txt")));
        PrintWriter out = new PrintWriter(new FileWriter(new File("output.txt")));
        //InputReader in = new InputReader(input);
        //PrintWriter out = new PrintWriter(output);
        Solution s = new Solution();
        s.solve(1, in, out);
        out.close();
    }
}