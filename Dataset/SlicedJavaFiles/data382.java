public class Main{    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long a = in.nextLong();
        long b = in.nextLong();
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextLong();
        }

        Map<Long,Integer> idxmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            idxmap.put(x[i], i);
        }
        if (a == b) {
            solve1(x, a, idxmap, out);
            return;
        }

        int[] mark = new int[n];
        Arrays.fill(mark, -1);
        boolean isok = true;
        for (int i = 0 ; i < n ; i++) {
            if (mark[i] != -1) {
                continue;
            }
            long w = x[i];
            long aw = a - w;
            long bw = b - w;
            if (idxmap.containsKey(aw) && idxmap.containsKey(bw)) {
                continue;
            } else if (idxmap.containsKey(bw)) {
                long w1 = w;
                long w2 = bw;
                while (true) {
                    if (!idxmap.containsKey(w1) || !idxmap.containsKey(w2)) {
                        break;
                    }
                    int i1 = idxmap.get(w1);
                    int i2 = idxmap.get(w2);
                    if (mark[i1] == 0 || mark[i2] == 0) {
                        isok = false;
                    }
                    mark[i1] = 1;
                    mark[i2] = 1;
                    if (w1 + a - b == w2) {
                        break;
                    }
                    w1 += (a - b);
                    w2 += (b - a);
                }
            } else if (idxmap.containsKey(aw)){
                long w1 = w;
                long w2 = aw;
                while (true) {
                    if (!idxmap.containsKey(w1) || !idxmap.containsKey(w2)) {
                        break;
                    }
                    int i1 = idxmap.get(w1);
                    int i2 = idxmap.get(w2);
                    if (mark[i1] == 1 || mark[i2] == 1) {
                        isok = false;
                    }
                    mark[i1] = 0;
                    mark[i2] = 0;
                    if (w1 + b - a == w2) {
                        break;
                    }
                    w1 += (b - a);
                    w2 += (a - b);
                }
            }
        }
        for (int i = 0 ; i < n ; i++) {
            if (mark[i] == -1) {
                isok = false;
                break;
            }
        }
        if (isok) {
            printAnswer(mark, out);
        } else {
            out.println("NO");
        }
        out.flush();
    }
}