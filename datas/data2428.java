public class Main{  public static void main(String[] args) {
    boolean even = true;
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
      for (int j = 0; j < i; j++) {
        if (a[j] > a[i]) {
          even = !even;
        }
      }
    }
    int m = in.nextInt();
    for (int i = 0; i < m; i++) {
      if ((1 - in.nextInt() + in.nextInt()) / 2 % 2 == 1) {
        even = !even;
      }
      if (even)
        out.println("even");
      else
        out.println("odd");
    }
    finish();
  }
}