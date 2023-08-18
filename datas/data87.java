public class Main{    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int best = 1;
        int bestTime = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            int time;
            int a = sc.nextInt();
            time = (a%n==0 || a%n<=i) ? a/n : (a+n)/n;
            if(time < bestTime) {
                best = i + 1;
                bestTime = time;
            }
        }

        pw.println(best);
        pw.close();
    }
}