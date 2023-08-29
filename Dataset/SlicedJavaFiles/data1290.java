public class Main{    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());

        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        int mod = 1000000007;

        if(n == 0) {
          out.println(0);
          out.close(); System.exit(0);
        }
        n %= mod;

        long ans = exp(2, (int)((k+1) % (mod-1)), mod);
        ans = (1L*ans * n) % mod;
        ans = ans + mod + 1 - exp(2, (int)((k) % (mod-1)), mod);
        ans %= mod;
        out.println(ans);
        // int n = scan.nextInt();

        out.close(); System.exit(0);
    }
}