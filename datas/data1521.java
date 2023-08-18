public class Main{    public static void main(String[] args) throws Exception {
        int numCnt = (int) nextLong();
        long k = nextLong();
        parent = new int[numCnt];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        long[] ar = new long[numCnt];
        for (int i = 0; i < numCnt; i++) {
            ar[i] = nextLong();
            map.put(ar[i] * 10007 + ar[i] / 13, i);
        }
        for (int i = 0; i < ar.length; i++) {
            long req = ar[i] * k;
            Integer idx=map.get(req * 10007 + req / 13);
            if (idx!=null) {
                union(i, idx);
            }
        }
        int[] count = new int[numCnt];
        for (int i = 0; i < parent.length; i++) {
            count[find(i)]++;
        }
        int res = 0;
        for (int i = 0; i < numCnt; i++) {
            res += (int) ((count[i] + 1) / 2.0);
        }
        System.out.println(res);
    }
}