public class Main{    public static void main(String[] args) throws NumberFormatException, IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer("");
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int max = n;
        max = Math.max(max, n / 10);
        max = Math.max(max, (n / 100) * 10 + n % 10);
        System.out.println(max);
    }
}