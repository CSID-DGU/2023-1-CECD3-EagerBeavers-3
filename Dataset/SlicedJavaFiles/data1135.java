public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        long n = Long.parseLong(st.nextToken());
        long s = Long.parseLong(st.nextToken());
        long i = (s / 10 + 1) * 10;
        if (n < 10 || n - sd(n + "") < s) {
            System.out.println(0);
            return;
        }
        while (!(i - sd(""+i) >= s)) {
            i += 10;
        }
        System.out.println(n - i + 1);
    }
}