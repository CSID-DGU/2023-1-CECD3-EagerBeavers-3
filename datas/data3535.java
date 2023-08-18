public class Main{    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        MinCostMaxFlowSolver solver = new EdmondsKarp();
        int[] people = new int[K];
        for(int i = 0; i < K; i++) people[i] = scanner.nextInt()-1;
        Node src = solver.addNode();
        Node snk = solver.addNode();
        int amt = 350;
        Node[][] timeNodes = new Node[N][amt];
        for(int i = 0; i < N; i++) {
            for(int j = 1; j < amt; j++) {
                timeNodes[i][j] = solver.addNode();
                if (j > 1) solver.link(timeNodes[i][j-1], timeNodes[i][j], Integer.MAX_VALUE, 0);
            }
        }
        for(int i = 0; i < K; i++) {
            solver.link(src, timeNodes[people[i]][1], 1, 0);
        }
        for(int i = 1; i < amt; i++) {
            for(int j = 0; j < K; j++) {
                solver.link(timeNodes[0][i], snk, 1, C*i-C);
            }
        }
        for(int i =0; i < M; i++) {
            int a = scanner.nextInt()-1;
            int b = scanner.nextInt()-1;
            for(int j = 1; j < amt-1; j++) {
                int prev = 0;
                for(int k = 1; k <= K; k++) {
                    solver.link(timeNodes[a][j], timeNodes[b][j + 1], 1, D*k*k- prev);
                    solver.link(timeNodes[b][j], timeNodes[a][j + 1], 1, D*k*k - prev);
                    prev = D * k * k;
                }
            }
        }
        long[] ret = solver.getMinCostMaxFlow(src, snk);
        out.println(ret[1]);
        out.flush();
    }
}