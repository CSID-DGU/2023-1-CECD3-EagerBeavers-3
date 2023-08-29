public class Main{    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
       
        int tc = sc.ni();
//        int tc = 1;
        for (int rep = 0; rep < tc; rep++) {
            int N = sc.ni();
            int[] arr = sc.intArray(N);
            pw.println(solve(arr));
        }
        
        pw.close();
    }
}