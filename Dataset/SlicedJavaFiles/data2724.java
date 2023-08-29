public class Main{    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n < 3) System.out.println(n);
        else{
            long t1 = LCM(n, n-1);
            long t2 = LCM(n-2, n-3);
        
            long l1 = LCM(t1, n-2);
            long l2 = LCM(t1, n-3);
            long l3 = LCM(n, t2);
            long l4 = LCM(n-1, t2);
        
        System.out.println(Math.max(l1, Math.max(l2, Math.max(l3, l4))));

        }
        
    }
}