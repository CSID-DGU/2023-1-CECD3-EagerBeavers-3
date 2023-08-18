public class Main{    public static void main(String[] args) {
        sc = new FastScanner();
        pw = new PrintWriter(System.out);

        int N = sc.ni();
        int M = sc.ni();
        int K = sc.ni();
        int[][] LR = new int[N][M-1];
        for (int i = 0; i < N; i++) {
            LR[i] = sc.intArray(M-1,0);
        }
        int[][] UD = new int[N-1][M];
        for (int i = 0; i < N-1; i++) {
            UD[i] = sc.intArray(M,0);
        }

        if (K%2==0) {
            int T = K/2;
            int[][] dist = new int[N][M];

            for (int step = 1; step <= T; step++) {
                int[][] newDist = new int[N][M];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        newDist[i][j] = INF;

                        //up
                        if (i > 0) {
                            newDist[i][j] = Math.min(newDist[i][j],UD[i-1][j]+dist[i-1][j]);
                        }

                        //down
                        if (i < N-1) {
                            newDist[i][j] = Math.min(newDist[i][j],UD[i][j]+dist[i+1][j]);
                        }

                        //left
                        if (j > 0) {
                            newDist[i][j] = Math.min(newDist[i][j],LR[i][j-1]+dist[i][j-1]);
                        }

                        //right
                        if (j < M-1) {
                            newDist[i][j] = Math.min(newDist[i][j],LR[i][j]+dist[i][j+1]);
                        }
                    }
                }
                dist = newDist;
            }
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    pw.print((2*dist[i][j]) + " ");
                }
                pw.println();
            }
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    pw.print("-1 ");
                }
                pw.println();
            }
        }
        pw.close();
    }
}