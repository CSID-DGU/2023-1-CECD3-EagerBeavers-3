public class Main{    public static void main(String[] args) throws FileNotFoundException {
        long beginTime = System.nanoTime();
        InputStream is = DEBUG ? new FileInputStream("resources/codeforcesedu43/ProblemC-1.in") : System.in;
        try (Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(is)))) {
            long x = scanner.nextLong();
            long k = scanner.nextLong();
            if (x != 0) {
                x = (2 * x - 1) % MODULUS;
                long twoPowK = modularPow(2, k, MODULUS);
                x = (x * twoPowK + 1) % MODULUS;
            }
            System.out.println(x % 1000000007);
        }
        System.err.println( "Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
    }
}