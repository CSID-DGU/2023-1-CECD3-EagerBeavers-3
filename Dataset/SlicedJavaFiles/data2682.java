public class Main{    public static void main(String[] args) {
        scanner = new FastScanner();
        int n = scanner.nextInt();
        int[] a = scanner.nextIntArray(n);
        int[] colors = new int[n];
        ADUtils.sort(a);
        int color = 0;
        for (int i = 0; i < n; i++) {
            if (colors[i] != 0) continue;
            color++;
            for (int j = i; j < n; j++) {
                if (a[j] % a[i] == 0) colors[j] = color;
            }
        }
        System.out.println(color);
    }
}