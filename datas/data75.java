public class Main{    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        long n = sc.nl();
        long k = sc.nl();
        long ans = (n+k-1)/n;
        System.out.println(ans);
    }
}