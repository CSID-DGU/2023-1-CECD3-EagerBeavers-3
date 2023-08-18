public class Main{    public static void main(String[] args) throws IOException {
        long n = in.nextLong(), m = in.nextLong();
        out.print(m / n + (m % n == 0 ? 0 : 1));
        out.close();
    }
}