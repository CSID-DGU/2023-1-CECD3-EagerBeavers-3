public class Main{    public static void main(final String[] args) throws FileNotFoundException {
        final Solution s = new Solution();
        final Long t1 = System.currentTimeMillis();
        s.solve();
        System.err.println(System.currentTimeMillis() - t1 + " ms");
        s.out.close();
    }
}