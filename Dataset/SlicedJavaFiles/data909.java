public class Main{    public static void main(String args[]) throws Exception {
        int n = nextInt();
        long k = nextInt();
        long a[] = new long[n + 1];
        Map<Long, Long> drb = new HashMap<Long, Long>();
        int elso = 1;
        long sk = 0;
        long sm = 0;
        long minjo = Long.MAX_VALUE;
        long minjoh = Long.MAX_VALUE;
        Vector<long[]> ret = new Vector<long[]>();
        for (int i = 1; i <= n; i++) {
            a[i] = nextInt();
            if (/*a[i - 1] <= a[i]*/true) {
                sm += a[i];
                if (drb.containsKey(a[i])) {
                    drb.put(a[i], drb.get(a[i]) + 1);
                } else {
                    drb.put(a[i], (long) 1);
                    sk++;
                }
                while (sk > k || drb.get(a[elso]) > 1) {
                    long s = drb.get(a[elso]);
                    if (s == 1) {
                        drb.remove(a[elso]);
                        sk--;
                    } else {
                        drb.put(a[elso], s - 1);
                    }
                    sm -= a[elso];
                    elso++;
                }
                if (sk == k) {
                    if (minjo > sm) {
                        minjo = sm;
                        ret.clear();
                        minjoh = i - elso;
                    }
                    if (minjo == sm) {
                        if (minjoh > i - elso) {
                            ret.clear();
                            minjoh = i - elso;
                        }
                        ret.add(new long[]{elso, i});
                    }
                }
            } else {
                elso = i;
                drb.clear();
                drb.put(a[i], (long) 1);
                sk = 1;
                sm = a[i];
                if (k == 1) {
                    if (minjo > sm) {
                        minjo = sm;
                        ret.clear();
                    }
                    if (minjo == sm) {
                        ret.add(new long[]{elso, i});
                    }
                }
            }
        }

        for (long[] r : ret) {
            System.out.print(r[0] + " ");
            System.out.print(r[1] + " ");
            break;
        }
        if (ret.size() == 0) {
            System.out.print(-1 + " ");
            System.out.print(-1 + " ");
        }
    }
}