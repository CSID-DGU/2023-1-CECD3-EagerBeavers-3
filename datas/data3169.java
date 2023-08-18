public class Main{    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int n1 = n/10;
        int s = n % 10;
        int n2 = n / 100 * 10+s;
        System.out.println(Math.max(n, Math.max(n1, n2)));
        pw.close();
    }
}