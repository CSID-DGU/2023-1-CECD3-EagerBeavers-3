public class Main{    public static void main(String args[]) throws IOException {
        in = new Reader();
        out = new PrintWriter(System.out);
        long n = in.nextLong();
        long s = in.nextLong();
        long low = 0, mid = 0, high = n;
        while (low <= high) {
            mid = (low + high) / 2;
            if (func(mid, s)) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        out.println(n - low + 1);
        out.close();
    }
}