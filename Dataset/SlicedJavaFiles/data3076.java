public class Main{    public static void main(String[] args)
    {
        Kattio io = new Kattio(System.in);

        int n = io.getInt();
        int ans = 0;
        int V = n;
        int A = n;

        A -= n/2;
        ans += n/2;

        V -= A;
        ans += A;

        A -= n/2;
        ans += n/2;

        io.println(ans);
        io.flush();
    }
}