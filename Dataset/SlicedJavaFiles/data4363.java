public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
//        int N = 19;
//        System.out.println(N + " " + ((N - 1) * N / 2));
//        for (int i = 1; i
//                <= N; i++) {
//            for (int j = i + 1; j <= N; j++) {
//                System.out.println(i + " " + j);
//            }
//        }
        int n = in.nextInt();
        int m = in.nextInt();
        dp = new long[n][1 << n + 1] ;

        map = new boolean[n][n];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            map[a][b] = true;
            map[b][a] = true;
          
        }
        for(long []temp : dp){
            Arrays.fill(temp, -1);
        }
        long result = 0;
        for(int i = 0; i < n; i++){
            result += cal((1<<i),i,i,1);
        }
        out.println((result/2));

        out.close();
    }
}