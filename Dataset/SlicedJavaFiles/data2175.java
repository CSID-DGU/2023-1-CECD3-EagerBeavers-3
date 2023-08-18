public class Main{  public static void main(String[] args) {
    FastScanner sc = new FastScanner();

    int n = sc.nextInt();
    long r = sc.nextInt();
    double d = 2 * r;
    long[] xs = sc.readLongArray(n);
    P[] points = new P[n];
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (i > 0) sb.append(' ');
      double y = r;
      for (int j = 0; j < i; j++) {
        long diff = Math.abs(xs[i] - points[j].x);
        if (diff <= 2 * r) {
          double dy = Math.sqrt(d * d - diff * diff);
          double testY = points[j].y + dy;
          y = Math.max(y, testY);
        }
      }

      sb.append(y);
      points[i] = new P(xs[i], y);
    }
    System.out.println(sb);
  }
}