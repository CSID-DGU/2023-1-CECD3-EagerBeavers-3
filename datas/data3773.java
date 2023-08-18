public class Main{    public static void main(String[] args) {
        MyScanner scanner = new MyScanner();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] d1 = new int[n][m-1];
        int[][] d2 = new int[n-1][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m-1;j++) {
                d1[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<m;j++) {
                d2[i][j] = scanner.nextInt();
            }
        }
        deal(n,m,k,d1,d2);
    }
}