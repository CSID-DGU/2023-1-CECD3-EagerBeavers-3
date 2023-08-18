public class Main{    public static void main(String[] args) {
        FastReader input = new FastReader();
        long n = input.nextLong();
        long K = input.nextLong();
        long root = (long) Math.sqrt(8 * (K+n) + 9);
        if (root * root != 8 * (K+n) + 9){
            root++;
            if (root * root != 8 * (K+n) + 9) root -= 2;
        }
        System.out.println(n - (root - 3) / 2);
        
        
    }
}