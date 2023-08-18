public class Main{    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        
        if( ((long)k * (long)(k + 1))/2 - 1 - (k - 2) < n){
            System.out.println(-1);
            return;
        }
        
        if(n == 1) {
            System.out.println(0);
            return;
        }
        
        if(n <= k) {
            System.out.println(1);
            return;
            
        }
        
        int ans = rek(2, k, n, k);
        
        System.out.println(ans);
    }
}