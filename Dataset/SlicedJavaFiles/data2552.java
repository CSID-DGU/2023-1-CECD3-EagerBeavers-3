public class Main{    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        FastWriter fw = new FastWriter();
        int n = fr.nextInt();
        int m = fr.nextInt();
        for (int r = 0; r < n / 2; r++) {
            for (int c = 0; c < m; c++) {
                fw.println((r + 1) + " " + (c + 1));
                fw.println((n - r) + " " + (m - c));
            }
        }
        if (n % 2 != 0) {
            int r = n / 2;
            for (int c = 0; c < m / 2; c++) {
                fw.println((r + 1) + " " + (c + 1));
                fw.println((r + 1) + " " + (m - c));
            }
            if (m % 2 != 0) fw.println((r + 1) + " " + (m / 2 + 1));
        }
        fw.close();
    }
}