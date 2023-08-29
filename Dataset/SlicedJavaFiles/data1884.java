public class Main{    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int a[] = new int[n+1];
        int b[] = new int[n+1];
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 1; i <= n; i++){
            a[i] = in.nextInt();
            set.add(a[i]);
        }
        int k = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int last = set.first();
        for(int i : set){
            if(i - last > 1) k += 2;
            else k += 1;
            map.put(i, k);
            last = i;
        }

        for(int i = 1; i <= n; i++){
            b[i] = map.get(a[i]);
        }

        BinaryIndexTree bit = new BinaryIndexTree(k);
        BinaryIndexTree freq = new BinaryIndexTree(k);


        BigInteger res = BigInteger.ZERO;

        for(int i = n; i >= 1; i--){
            long l = bit.query(1, b[i]-2), r = bit.query(b[i]+2, k);
            long lf = freq.query(1, b[i]-2), rf = freq.query(b[i]+2, k);

            res = res.add(BigInteger.valueOf(r));
            res = res.add(BigInteger.valueOf(l));
            res = res.subtract(BigInteger.valueOf(rf*a[i]));
            res = res.subtract(BigInteger.valueOf(lf*a[i]));
            
            bit.add(b[i], a[i]);
            freq.add(b[i], 1);
        }

        pw.println(res);

        pw.close();
    }
}