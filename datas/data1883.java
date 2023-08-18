public class Main{    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int n = in.nextInt();
        long[] arr = new long[n];//in.nextLongArray(n);
        for (int i = 0; i < n; i++) {
            //if (i < n / 2) arr[i] = 1;
            //else arr[i] = 1000000000;
            arr[i] = in.nextLong();
        }
        long sum = 0;
        long count = 0;
        
        TreeSet<Long> ts = new TreeSet<>();
        ts.add(1L);
        long oo = 1000000000 + 100;
        ts.add(oo);
        for (long a : arr) {
            a += 10;
            ts.add(a);
            ts.add(a - 2);
            ts.add(a + 2);
        }
        
        long[] inds = new long[ts.size()];
        int idx = 0;
        for (long a : ts) {
            inds[idx++] = a;
        }
        
        SuperBIT bit1 = new SuperBIT(inds);
        SuperBIT bit2 = new SuperBIT(inds);
        BigInteger ans = BigInteger.valueOf(0);
        
        for (long a : arr) {
            a += 10;
            
            long countLess = bit1.queryCompr(1, a - 2);
            long sumLess = bit2.queryCompr(1, a - 2);
            
            long countMore = bit1.queryCompr(a + 2, oo);
            long sumMore = bit2.queryCompr(a  + 2, oo);
            
            //System.out.println(a + "  " + countLess + "  " + sumLess + "  " + countMore + "  " + sumMore);
            bit1.updateCompr(a, 1);
            bit2.updateCompr(a, a);
            
            long tmp = 0;
            tmp += countLess * a - sumLess;
            tmp -= sumMore - countMore * a;
            ans = ans.add(BigInteger.valueOf(tmp));
        }
        
        out.println(ans);
        
        
        out.close();
    }
}