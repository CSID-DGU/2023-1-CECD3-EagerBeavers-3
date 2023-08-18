public class Main{  public static void main(String[] args){
    FastScanner sc = new FastScanner();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long result = 0L;

    while(a != 0 && b != 0) {
      if(a > b) {
        result += a/b;
        a = a % b;
      } else {
        result += b/a;
        b = b % a;
      }

      long gcd = gcd(a, b);
      a /= gcd;
      b /= gcd;
    }

      System.out.println(result);
  }
}