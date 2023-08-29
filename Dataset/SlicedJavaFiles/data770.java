public class Main{    public static void main(String[] args) throws IOException {
        int n = in();
        String s = next();
        int total = 0;
        int[] seq = new int[n];
        boolean[] c = new boolean[100000];
        for (int i = 0; i < n; i++) {
            seq[i] = s.charAt(i);
            if (!c[seq[i]]) {
                total++;
                c[seq[i]] = true;
            }
        }

        Arrays.fill(id, -1);
        int best = Integer.MAX_VALUE;
        TreeSet<Integer> q = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return id[o1] - id[o2];
            }
        });
        for (int i = 0; i < n; i++) {
            q.remove(seq[i]);
            id[seq[i]] = i;
            q.add(seq[i]);
            if (q.size() == total) {
                //System.out.println("best: i=" + i + " id=" + id[q.first()]);
                best = Math.min(best, i - id[q.first()] + 1);
            }
            //System.out.println("i="+i+" " +q.toString());
        }

        System.out.println(best);

    }
}