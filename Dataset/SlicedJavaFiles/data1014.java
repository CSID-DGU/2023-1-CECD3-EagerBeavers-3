public class Main{  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    long k = sc.nextLong();
    if (k == 1) {
      System.out.println(1);
      return;
    }
    long lo = 1, hi = k, res = 1;
    while(lo <= hi) {
      long mid = lo + hi >> 1L;
      if(cnt(mid) < k) {
        res = mid;
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }

    ArrayList<Integer> digits = new ArrayList<>();
    long tmp = res;
    while (tmp > 0) {
      digits.add((int)(tmp % 10));
      tmp /= 10;
    }
//    System.err.println("RES " + res);
//    System.err.println("DIGITS " + digits);
//    System.err.println("Cnt Res " + cnt(res));
    Collections.reverse(digits);
    out.println(digits.get((int)(k - cnt(res) - 1)));
    out.flush();
  }
}