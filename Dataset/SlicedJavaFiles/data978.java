public class Main{    public static void main(String[] args) {
        FastReader in = new FastReader();
        long n = in.nextInt();
        long k = in.nextInt();
        long left = 0, right = n;
        while (left <= right) {
            long middle = (left+right)/2;
            if (ok(n, k, middle)) right = middle-1;
            else left=middle+1;
        }
        System.out.println(left);
    }
}