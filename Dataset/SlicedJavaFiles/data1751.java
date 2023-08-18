public class Main{    public static void main(String[] args) throws IOException {
        int n = nextInt();
        double t = nextInt();
        Sort[] p = new Sort[n];

        for (int i = 0; i < n; i++) {
            p[i] = new Sort();
            p[i].x = nextInt();
            p[i].a = nextInt();
        }
        int ans = 2;
        Arrays.sort(p);
        for (int i = 1; i < p.length; i++) {
            double k = p[i].x - p[i].a / 2.0 - p[i - 1].x - p[i - 1].a / 2.0;
            if (t == k)
                ans++;
            else if (k > t)
                ans += 2;
        }
        System.out.println(ans);
    }
}