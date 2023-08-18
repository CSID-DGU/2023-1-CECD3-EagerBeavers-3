public class Main{    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s[] = in.readLine().split(" ");
        long r = Long.parseLong(s[0]);
        long l = Long.parseLong(s[1]);
        if (r % 2 == 0) {
            if (l - r+1 < 3) {
                out.println(-1);
            } else {
                out.println(r + " " + (r + 1) + " " + (r + 2));
            }
        } else {
            if (l - r+1 < 4) {
                out.println(-1);
            } else {
                out.println((r + 1) + " " + (r + 2) + " " + (r + 3));
            }

        }
        out.close();

    }
}