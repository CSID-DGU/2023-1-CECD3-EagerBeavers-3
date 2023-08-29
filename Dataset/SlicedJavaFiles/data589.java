public class Main{    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        int d = nextInt();
        int ans = 2;
        int b[] = new int [n];
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            b[i] = nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (b[i] - b[i - 1] >= d * 2) {
                ans++;
            }
            if (b[i] - b[i - 1] > d * 2) {
                ans++;
            }
        }
        pw.println(ans);
        pw.close();
    }
}