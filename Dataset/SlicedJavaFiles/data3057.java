public class Main{  public static void main(String[] args)
  throws IOException
  {
    FastReader fr = new FastReader();
    long n = fr.nextLong();
    long x = fr.nextLong();
    long y = fr.nextLong();
    long w = Long.min(x,y) - 1 + (x - Long.min(x,y)) + (y - Long.min(x,y));
    long b = n - Long.max(x,y) + (Long.max(x,y) - x) + (Long.max(x,y) - y);
    if(w <= b) System.out.println("White");
    else System.out.println("Black");

  }
}