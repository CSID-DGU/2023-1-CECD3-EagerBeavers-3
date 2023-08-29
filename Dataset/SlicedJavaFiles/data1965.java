public class Main{    public static void main(String[] args) throws IOException{
        st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = nextInt();
        int k = nextInt();
        Sort[]a = new Sort[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = new Sort();
            a[i].x = nextInt();
            a[i].y = nextInt();
        }
        Arrays.sort(a,1, n+1);
//      for (int i = 1; i <= n; i++) {
//          System.out.println(a[i].x+" "+a[i].y);
//      }
//      int plase = 1;
//      if (k==1) {
//          int ans = 0;
//          for (int j = 1; j <= n; j++) {
//              if (a[j].x==a[1].x && a[j].y ==a[1].y) {
//                  ans++;
//              }
//          }
//          System.out.println(ans);
//          return;
//      }
//      for (int i = 2; i <= n; i++) {
//          if (a[i].x==a[i-1].x && a[i].y==a[i-1].y) {
//              
//          }
//          else {
//              plase++;
//              if (plase==k) {
//                  int ans = 0;
//                  for (int j = 1; j <= n; j++) {
//                      if (a[j].x==a[i].x && a[j].y ==a[i].y) {
//                          ans++;
//                      }
//                  }
//                  System.out.println(ans);
//                  return;
//              }
//          }
//      }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i].x==a[k].x && a[i].y==a[k].y)
                ans++;
        }
        System.out.println(ans);
        pw.close();
    }
}