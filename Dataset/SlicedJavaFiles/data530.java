public class Main{    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
       
        int tc = sc.ni();
        for (int rep = 0; rep < tc; rep++) {
            pw.println(solve(sc,pw));
            //solve(sc,pw);
        }
        
        
        pw.close();
    }
}