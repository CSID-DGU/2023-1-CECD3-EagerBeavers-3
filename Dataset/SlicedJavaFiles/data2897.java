public class Main{    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        in = new FastReader(System.in);
        out = new PrintWriter(System.out);

        int n = in.nextInt();
        int a = ((n & 1) == 0) ? a = 6 : 9;
        int b = n - a;
        out.println(a + " " + b);

        out.flush();
    }
}