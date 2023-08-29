public class Main{  public static void main(String[] args) {
    FastIO in = new FastIO(), out = in;
    n = in.nextLong();
    m = in.nextLong();
    k = in.nextLong();
    mod = (long)1e9 + 9;
    long x = m - (n-n%k)/k * (k-1) - n%k;
    if(x < 0) x = 0;
    long ans = (pow(2,x+1)-2)*k + m-x*k;
    ans = ((ans%mod)+mod)%mod;
    out.println(ans);
    out.close();
  }
}