public class Main{    public static void main(String[] args) throws NumberFormatException, IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer("");
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        int mod = (int) (1e9+9);
        int correct = n - n / k;
        int carry = n % k;
        long ans;
        if(correct >= m){
            ans = m;
        }else{
            m -= correct;
            int block = n / k;
            BigInteger pow = BigInteger.valueOf(2).modPow(BigInteger.valueOf(m + 1), BigInteger.valueOf(mod));
            ans = (pow.longValue() - 2 + mod) % mod;
            ans = (ans * (long) k) % mod;
            ans = (ans + (long)(block - m)* (long)(k-1) + carry) % mod;
        }
        System.out.println(ans);
        
    }
}