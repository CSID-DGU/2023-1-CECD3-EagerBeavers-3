public class Main{    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = nextInt();
        int k = nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = nextInt();
        }
        Set<Integer> set_1 = new HashSet<Integer>();
        for (int i = 1; i <= n; i++) {
            set_1.add(a[i]);
            if (set_1.size() == k) {
                Set<Integer> set_2 = new HashSet<Integer>();
                for (int j = i; j >= 1; j--) {
                    set_2.add(a[j]);
                    if (set_2.size() == k) {
                        out.print(j + " " + i);
                        out.close();
                        return;
                    }
                }
            }
        }
        out.print("-1 -1");
        out.close();

    }
}