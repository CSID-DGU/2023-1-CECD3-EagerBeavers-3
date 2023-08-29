public class Main{    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        double a = nextInt();
        double v = nextInt();
        double L = nextInt();
        double d = nextInt();
        double w = nextInt();
        double ans = 0;
        if (w >= v)
            ans = go(0, a, L, v);
        else {
            ans = go(Math.min(w, Math.sqrt(2*a*d)), a, L-d, v);
            if (2*a*d < w*w)
                ans += Math.sqrt(2*d/a);
            else {
                if (d-v*v/(2*a) >= (v*v-w*w)/(2*a))
                    ans += v/a+(v-w)/a+(d-v*v/(2*a)-(v*v-w*w)/(2*a))/v;
                else {
                    double x = Math.sqrt((w*w+2*a*d)/2);
                    ans += x/a+(x-w)/a;
                }
            }
        }
        System.out.println(ans);
        pw.close();
    }
}