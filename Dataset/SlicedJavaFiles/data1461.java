public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String[] line = s.readLine().split(" ");
        long n = Long.valueOf(line[0]);
        long y = Long.valueOf(line[1]);
        long x = Long.valueOf(line[2]);
        long c = Long.valueOf(line[3]);
        
        long min = 0;
        long max = n*2L+20;
        for (int cnt = 0 ; cnt < 300 ; cnt++) {
            long med = (min+max) / 2L;
            long ct = isok(med, n, x, y, c); 
            if (ct >= c) {
                max = med;
            } else {
                min = med+1;
            }
        }
        
        long lst = max;
        for (long d = -2 ; d <= 2 ; d++) {
            if (max+d >= 0 && isok(max+d, n, x, y, c) >= c) {
                lst = Math.min(lst, max+d);
            }
        }
        
        out.println(lst);
        out.flush();
    }
}