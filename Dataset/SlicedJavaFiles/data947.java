public class Main{    public static void main(String[] args) throws IOException
    {
        Reader in = new Reader();
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long n = in.nextLong();
        long k = in.nextLong();
        long val = 2 * n + 2 * k;
        long D = 9 + 4 * val;
        long sqrtD = (long)Math.sqrt((double)D);
        double r1 = (-3 + sqrtD) / 2;
        long r1DAsh = (long)r1;
        System.out.println(n - r1DAsh);
    }
}