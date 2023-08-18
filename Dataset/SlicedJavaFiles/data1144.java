public class Main{    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken()),
            s = Long.parseLong(st.nextToken());
        long m = s;
        while (m-f(m)<s && m<=n) m++;
        System.out.println(Math.max(n-m+1, 0));
    }
}