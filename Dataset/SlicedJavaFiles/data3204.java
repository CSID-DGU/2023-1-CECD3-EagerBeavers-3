public class Main{    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int n = in.nextInt();
        if (n >= 0) {
            out.println(n);
        } else {
            int res = n;
            n = Math.abs(n);

            String s = String.valueOf(Math.abs(n));
            if (s.length() == 1) {
                res = 0;
            } else {
                res = Math.max(-Integer.parseInt(s.substring(0, s.length() - 1)), res);
                res = Math.max(-Integer.parseInt(s.substring(0, s.length() - 2) + s.charAt(s.length() - 1)), res);
            }

            out.println(res);
        }

        out.close();
    }
}