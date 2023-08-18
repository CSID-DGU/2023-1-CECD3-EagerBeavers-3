public class Main{    public static void main(String[] args)
    {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        long n=in.nextLong();
        if(n<=2)
            out.println(n);
        else
            out.println(max(lcm(n, n-1, n-2), max(lcm(n, n-1, n-3), lcm(n-1, n-2, n-3))));
        out.close();
    }
}