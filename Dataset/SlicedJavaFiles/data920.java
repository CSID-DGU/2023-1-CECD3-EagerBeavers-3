public class Main{    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = in.nextLong();
        k = in.nextLong();
        long ans = n - TernarySearch(0, n);
        pw.println(ans);
        pw.close();
    }
}