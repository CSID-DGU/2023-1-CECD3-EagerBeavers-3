public class Main{    public static void main(String[] args) {
        
        FastReader in = new FastReader();
        
        long n = in.nextLong();
        long m = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long total = 0;
        
        long val =(n%m);
        if (n%m != 0){
            
            long x = (val)*b;
            long y = (m-val)*a;
            
            total = Math.min(x, y);
        }
        System.out.println(Math.abs(total));
        
    }
}