public class Main{    public static void main(String[] args) throws Exception {
        HashSet<Integer> set = new HashSet<>();
        int n = nextInt();
        int k = nextInt();
        int[] m = new int[n];
        int[] d = new int[n];
        for(int i = 0;i < n;i++) m[i] = nextInt();
        int l = -1;
        int r = -1;
        for(int i = 0;i < n;i++) {
            set.add(m[i]);
            d[i] = set.size();
            if(d[i] == k) {
                r = i;
                break;
            }
        }
        if(r == -1) {
            out.println("-1 -1");
            return;
        }

        for(int i = r;i >= 0;i--) {
            set.remove(m[i]);
            if(set.size() == 0) {
                l = i;
                break;
            }
        }
        out.println((l+1)+" "+(r+1));
    }
}