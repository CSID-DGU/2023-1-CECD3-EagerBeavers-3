public class Main{    public static void main(String[] args) throws IOException {
        pw = new PrintWriter(new OutputStreamWriter(System.out));
        br = new BufferedReader(new InputStreamReader(System.in));
        (new Thread(new Round1TaskB())).start();
    }
}