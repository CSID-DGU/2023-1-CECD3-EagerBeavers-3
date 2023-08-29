public class Main{  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong();
    long k = in.nextLong();

    long res = solve(n, k);
    System.out.println(res);
  }
}