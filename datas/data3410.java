public class Main{    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        //final String FILENAME = "dvd";
        //in = new BufferedReader(new FileReader(new File(FILENAME + ".in")));
        //out = new PrintWriter(new File(FILENAME + ".out"));
        in = new BufferedReader(new InputStreamReader(System.in));
        //in = new Scanner(System.in);
        out = new PrintWriter(System.out);
        st = new StringTokenizer(" ");
        new Main().run();
        out.close();
    }
}