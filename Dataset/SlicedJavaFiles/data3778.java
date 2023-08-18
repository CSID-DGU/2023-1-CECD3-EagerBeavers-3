public class Main{  public static void main(String[] args) {
    int n = scan.nextInt();
    int m = scan.nextInt();
    int k = scan.nextInt();
    int x[][] = new int[n][m];
    int y[][] = new int[n][m];
    for(int i=0; i<n; ++i) {
      for(int j=0; j<m-1; ++j) {
        x[i][j] = scan.nextInt();
      }
    }
    for(int i=0; i<n-1; ++i) {
      for(int j=0; j<m; ++j) {
        y[i][j] = scan.nextInt();
      }
    }
    Main mm = new Main(x,y,k);
    mm.go();
  }
}