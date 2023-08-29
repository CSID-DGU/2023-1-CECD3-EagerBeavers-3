public class Main{    public static void main(String[] args) throws IOException {
        in = new Reader();
        out = new PrintWriter(new OutputStreamWriter(System.out));

//        int t = in.nextInt();
//        for (int i = 0; i < t; i++) {
//        }
        run();

        out.flush();
        in.close();
        out.close();
    }
}