public class Main{    public static void main(String[] args) throws IOException {
        FastScanner sc=new FastScanner();
        long K = sc.nextLong();
        long nums = 9;
        int digits = 1;
        while (K > nums*digits) {
        	K -= nums*digits;
        	nums *= 10;
        	digits++;
        }
        long removal = (K-1)/digits;
        int pos = (int)((K-1)%digits);
        long base = (long)Math.pow(10,digits-1);
        String num = Long.toString(base+removal);
        System.out.println(num.charAt(pos));
    }
}