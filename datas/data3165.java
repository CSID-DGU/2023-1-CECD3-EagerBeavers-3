public class Main{    public static void main(String[] args) throws IOException {
        init(System.in, System.out);
        int n = nextInt();
        //long startTime = System.currentTimeMillis();
        if (n > 0) {
            out.write(n + "\n");
        } else {
            String s = n + "";
            String s2 = s.substring(0, s.length() - 1);
            String s3 = s.substring(0, s.length() - 2) + s.charAt(s.length() - 1);
            int a = Integer.parseInt(s2);
            int b = Integer.parseInt(s3);
            int ans = Math.max(a, b);
            out.write(ans + "\n");
        }
        //long runTime = System.currentTimeMillis() - startTime;
        //out.write(runTime + "\n");
        out.flush();
    }
}