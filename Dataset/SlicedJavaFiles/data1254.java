public class Main{  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = reader.readLine().split(" ");
    long x = Long.parseLong(strs[0]);
    long k = Long.parseLong(strs[1]);
    long twoPK = modPow(2, k);
    long twoPK_1 = (twoPK * 2) % mod;
    long res = ((twoPK_1 * (x % mod)) % mod - (twoPK - 1) + mod) % mod;
    System.out.println(x == 0? x: res);
  }
}