public class Main{    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("1"));
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        int n = nextInt(), k = nextInt();
        int[] primes = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 0) {
                primes[i] = 1;
                for (int j = i * 2; j <= n; j += i)
                    primes[j] = 2;
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashSet<Integer> p = new HashSet<Integer>(), v = new HashSet<Integer>();
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 1) {
                res.add(i);
                p.add(i);
            }
        }
        int c = 0;
        if (res.size() >= 3) {
            for (int i = 2; i < res.size(); i++) {
                int zz = res.get(i - 2) + res.get(i - 1) + 1;
                if (p.contains(zz))
                    v.add(zz);
            }
            c = v.size();
        }
        if (c >= k) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        in.close();
        out.close();
    }
}