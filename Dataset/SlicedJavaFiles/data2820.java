public class Main{     public static void main(String []args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      while(n-->0)
      {
          int a=sc.nextInt();
          int b=sc.nextInt();
          int ans=f(a,b);
          System.out.println(ans);
      }
     }
}