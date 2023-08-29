public class Main{  public static void main(String[] args) {
    int n = in.nextInt();
    int[] sol = new int[n];
    sol[0] = 1;
    int mod = 1000000007;
    int maxind = 0;
    boolean f = true;
    for (int i = 0; i < n; i++) {
      if (!f) {
        //int accum = sol[0];
        for (int j = 1; j <= maxind; j++) {
          sol[j] += sol[j-1];
          sol[j] %= mod;
        }
        //out.println(Arrays.toString(sol));
      }
      if (in.next().equals("f")) {
        maxind++;
        f = true;
      }
      else {
        f = false;
      }
    }
    int ans = 0;
    for (int i = 0; i <= maxind; i++) {
      ans += sol[i];
      ans %= mod;
    }
    out.println(ans);
    finish();
  }
}