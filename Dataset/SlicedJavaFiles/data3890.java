public class Main{    public static void main(String[] args) {
        FastScanner57 fs = new FastScanner57();
        PrintWriter pw = new PrintWriter(System.out);
        int t = fs.ni();
        //int t = 1;
        for (int tc = 0; tc < t; tc++) {
            int n = fs.ni();
            int[] q = new int[n+5];
            int ind = 0;
            q[0] = 1;
            for (int i = 0; i < n; i++) {
                int a = fs.ni();
                while (q[ind]!=a) ind--;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < ind; j++) {
                    sb.append(q[j]-1);
                    sb.append(".");
                }
                    sb.append(a);
                    q[ind]++;
                    q[ind+1] = 1;
                    ind++;
                    pw.println(sb);
            }
        }
        pw.close();

    }
}