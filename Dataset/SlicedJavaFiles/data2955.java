public class Main{    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a==b) System.out.println("1");
        else if(b==1) System.out.println(a);
        else if(a==1) System.out.println(b);
        else if(a>b) System.out.println(count(a,b));
        else System.out.println(count(b,a));
    }
}