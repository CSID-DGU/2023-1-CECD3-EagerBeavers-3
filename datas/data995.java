public class Main{    public static void main(String args[])throws Exception {
        double n,k;
        n=sc.nextDouble();
        k=sc.nextDouble();
        double ans=0;
        ans=Math.sqrt(2.25+2*(n+k))-1.5;
        System.out.printf("%.0f\n",n-ans);
    }
}