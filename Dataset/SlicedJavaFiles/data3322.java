public class Main{    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int V = in.readInt();
        int E = in.readInt();
        Point[] edges = new Point[E];
        for (int i = 0; i < edges.length; i++) {
            edges[i] = new Point(in.readInt() - 1, in.readInt() - 1);
        }
        int best = Integer.MAX_VALUE;
        for (int k = 0; k < V; k++) {
            int n = V - 1;
            graph = new ArrayList[n];
            left = new int[n];
            vis = new boolean[n];
            right = new int[n];
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<Integer>();
            }
            int center = 0;
            for (int i = 0; i < E; i++) {
                if (edges[i].x == k || edges[i].y == k) {
                    center++;
                    continue;
                }
                int src = edges[i].x > k ? edges[i].x - 1 : edges[i].x;
                int dst = edges[i].y > k ? edges[i].y - 1 : edges[i].y;
                graph[src].add(dst);
            }
            int matching = getMaxMatch();
            int addToCenterEdges = 2 * V - 1 - center;
            int removed = E - center - matching;
            int added = n - matching;
            best = Math.min(best, added + removed + addToCenterEdges);
        }
        System.out.println(best);
    }
}