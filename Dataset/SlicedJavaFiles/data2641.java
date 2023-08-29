public class Main{    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);
        int n = nextInt();
        int a[] = new int [n];
        for(int i = 0;i < n;i++) a[i] = nextInt();
        int ans = 0;
        boolean b[] = new boolean[n];
        Arrays.sort(a);

        for(int i = 0;i < n;i++) {
            if (!b[i]) {
                for(int j = i;j < n;j++) {
                    if (a[j] % a[i] == 0) b[j] = true;
                }
                ans++;
            }
        }
        pw.println(ans);
        pw.close();
    }
}