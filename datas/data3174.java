public class Main{    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        
        int f1 = a/10;
        
        int b = a;
        int last = a%10;
        
        b/=10;
        b/=10;
        b*=10;
        b+=last;
        
        System.out.println(Math.max(a, Math.max(f1, b)));
        
        
        
    }
}