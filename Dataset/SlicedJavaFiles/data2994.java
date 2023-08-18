public class Main{    public static void main(String[] args) throws IOException {
      FastReader sc = new FastReader();
      int x= sc.nextInt();
      int y= sc.nextInt();
      int z= sc.nextInt();
      int t1= sc.nextInt();
      int t2= sc.nextInt();
      int t3= sc.nextInt();
      if(Math.abs(x-y)*t1 < (Math.abs(x-z)+Math.abs(x-y))*t2+3*t3 ) System.out.println("NO");
      else System.out.println("YES");
    }
}