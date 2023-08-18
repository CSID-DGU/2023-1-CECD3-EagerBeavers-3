public class Main{    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder sb = new StringBuilder();
        n = sc.nextInt();
        r = sc.nextInt();
        x = new int[n];
        horo = new HashMap<Integer, Double>();
        for (int x = 0; x <= r*2; x++) {
            double y = 2.0 *Math.sqrt(r * r - (r - x/2.0) * (r - x/2.0));
            horo.put(x, y);
        }
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        List<Double> y = new ArrayList<Double>();
        for (int i = 0; i < n; i++) {
            double max = r;
            for (int j = 0; j < y.size(); j++) {
                int dx = intersects(i, j);
                if (dx >= 0) {
                    double dy = horo.get(dx);
                    max = Math.max(max, dy + y.get(j));
                }
            }
            y.add(max);
        }
        for (int i = 0; i < n; i++) {
            sb.append(y.get(i) + " ");
        }
        System.out.println(sb);
    }
}