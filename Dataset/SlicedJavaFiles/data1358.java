public class Main{    public static void main(String[] args) throws IOException {
        in = new Scanner(System.in);
        out = new PrintWriter(System.out);
        n = in.nextInt() + 1;
        first = new int[]{0, 0, n, n};
        second = new int[]{0, 0, n, n};
        for (int i = 0; i < first.length; i++) {
            boolean inc = i < 2;
            search(first, i, inc, false);
            if (!inc) {
                first[i] += 1;
            }
        }

        for (int i = 0; i < second.length; i++) {
            boolean inc = i < 2;
            search(second, i, inc, true);
            if (!inc) {
                second[i] += 1;
            }
        }
        String s = "!";
        for (int i = 0; i < 4; i++) {
            s += " " + second[i];
        }
        for (int i = 0; i < 4; i++) {
            s += " " + first[i];
        }
        out.println(s);
        out.flush();
    }
}