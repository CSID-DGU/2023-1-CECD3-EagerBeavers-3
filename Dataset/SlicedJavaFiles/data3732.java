public class Main{    public static void main(String[] args) throws IOException {
        Reader in = new Reader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        build_prime();
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            run(in, out);
        }

        out.flush();
        in.close();
        out.close();
    }
}