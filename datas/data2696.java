public class Main{    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out, false);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Arrays.sort(arr);
        int[] cols = new int[n];
        Arrays.fill(cols, -1);
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if (cols[i] == -1) {
                cols[i] = ans++;
                for(int j = i + 1; j < n; j++) {
                    if (arr[j] % arr[i] == 0) cols[j] = cols[i];
                }
            }
        }
        out.println(ans);
        out.flush();
    }
}