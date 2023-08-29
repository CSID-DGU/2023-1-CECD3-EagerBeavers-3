public class Main{    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);
        int test = nextInt();
        while(test-- > 0) {
            n = nextInt();
            m = nextInt();
            a = new int [n][m];
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) a[i][j] = nextInt();
            }
            used = new ArrayList<>();
            num = new int [n * m];
            ans = 0;

            pair b[] = new pair[n * m];

            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    b[i * m + j] = new pair(a[i][j], j);
                }
            }

            Arrays.sort(b, new pair());

            for(int i = b.length - 1;i >= Math.max(0, b.length - 5);i--) {
                int v = b[i].y;

                boolean bad = false;

                for(int j = 0;j < used.size();j++) if (used.get(j) == v) bad = true;

                if (!bad) used.add(v);
            }

            rec(0);

            pw.println(ans);
        }
        pw.close();
    }
}