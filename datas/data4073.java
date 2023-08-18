public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        n = sc.nextInt();
        int[] dx = new int[n];
        int[] dy = new int[n];

        for(int i=0;i<n;i++){
            dx[i] = sc.nextInt();
            dy[i] = sc.nextInt();
        }

        d = new int[n];
        for(int i=0;i<n;i++){
            d[i] = (x-dx[i])*(x-dx[i]) + (y-dy[i])*(y-dy[i]);
        }

        t = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                t[i][j] = (dx[i]-dx[j])*(dx[i]-dx[j]) + (dy[i]-dy[j])*(dy[i]-dy[j]);
            }
        }
//        out.println(Arrays.toString(d));
//        out.println(Arrays.deepToString(t));

        solve();
    }
}