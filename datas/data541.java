public class Main{    public static void main(String[] args) {
        sc = new FastScanner();
        pw = new PrintWriter(System.out);
        


        int Q = sc.ni();
        for (int q = 0; q < Q; q++) {
            int N = sc.ni();
            String ans = "NO";
            if (N%2==0 && isSquare(N/2))
                ans = "YES";
            if (N%4==0 && isSquare(N/4))
                ans = "YES";
            pw.println(ans);
        }
        pw.close();
    }
}