public class Main{    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        n = in.readInt();
        int m = in.readInt();
        E = new LinkedList[n];
        M = new int[n];
        boolean[][] C = new boolean[n][n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++)
            E[i] = new LinkedList<Integer>();
        for (int i = 0; i < m; i++) {
            int x = in.readInt() - 1;
            int y = in.readInt() - 1;
            C[x][y] = true;
            E[x].add(y);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int res = 0;
            int all = 0;
            for (int j = 0; j < n; j++)
                if (j != i) {
                    all += E[j].size();
                    if (!C[i][j])
                        res++;
                    if (!C[j][i])
                        res++;
                    else
                        all--;
                }
            if (!C[i][i])
                res++;
            center = i;
            int match = maxMatch();
            res += (all - match) + (n - match - 1);
            min = Math.min(min, res);
        }
        System.out.println(min);
    }
}