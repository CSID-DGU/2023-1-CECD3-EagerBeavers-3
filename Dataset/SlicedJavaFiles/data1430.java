public class Main{    public static void main(String[] args) throws Exception {
        in = new Scanner(System.in);
//		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//		in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        long n = in.nextLong(), x = in.nextLong(), y = in.nextLong(), c = in.nextLong();

        long res = 0;
        while (count(res, x, y, n) < c) res++;
        out.println(res);


        out.println();
        out.close();
    }
}