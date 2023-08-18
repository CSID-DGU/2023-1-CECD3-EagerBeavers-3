public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long d = n-m;
        n -= d*k;
        if (n <= 0)
        {
            System.out.println(m);
            return;
        }
        long sum = (n%k) + d*(k-1);
        sum += 2*k*(pow(2,n/k)-1);
        sum %= mod;
        System.out.println(sum);
    }
}