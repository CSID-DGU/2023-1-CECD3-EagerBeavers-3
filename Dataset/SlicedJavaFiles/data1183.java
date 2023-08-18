public class Main{    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
//        InputStream inputStream = new FileInputStream("dijkstra.in");
        OutputStream outputStream = System.out;
//        OutputStream outputStream = new FileOutputStream("dijkstra.out");
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Answer solver = new Answer();
        solver.solve(in, out);
        out.close();
    }
}