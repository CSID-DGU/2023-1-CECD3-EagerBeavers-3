public class Main{    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(4 + " " + (n-4));
        }
        else{
            int a = Math.min(9,n-9);
            int b = Math.max(9,n-9);
            System.out.println(a + " " + b);
        }
    }
}