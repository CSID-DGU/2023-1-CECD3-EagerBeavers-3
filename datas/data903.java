public class Main{    public static void main(String[] args) throws IOException {
        int n, k;
        n = nextInt();
        k = nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        int[] ar = new int[n];
        int ii = 0, jj = -1;
        for (int i = 0; i < n; i++) {
            ar[i] = nextInt();

            Integer iii = hm.get(ar[i]);
            if(iii!=null)
            hm.put(ar[i], ++iii); else hm.put(ar[i], 1);
            hs.add(ar[i]);
            if (hs.size() == k) {
                jj = i;
                break;
            }
        }
        if (jj == -1) {
            System.out.println(-1 + " " + (-1));
            System.exit(0);
        }
        for (int i = 0; i < ar.length; i++) {
            Integer iii = hm.get(ar[i]);
            if (iii != null && iii - 1 > 0) {
                hm.put(ar[i], --iii);
                ii++;
            } else {
                break;
            }
        }
        System.out.println((ii+1) + " " + (jj+1));

    }
}