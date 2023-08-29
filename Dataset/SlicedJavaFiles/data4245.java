public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            n = in.nextInt();
            m = in.nextInt();
            arr = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] = in.nextInt();
                }
            }
            Item[] max = new Item[m];
            for (int j = 0; j < m; j++) {
                max[j] = new Item(j, 0);
                for (int k = 0; k < n; k++) {
                    max[j].x = Math.max(max[j].x, arr[k][j]);
                }
            }
            Arrays.sort(max);
            int[] cols = new int[Math.min(n, m)];
            for (int j = 0; j < cols.length; j++) {
                cols[j] = max[j].i;
            }
            System.out.println(calc(cols, 0, ""));
        }
    }
}