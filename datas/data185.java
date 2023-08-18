public class Main{    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         int x=m%(int)Math.pow(2,n);
         System.out.println(x);



}
}