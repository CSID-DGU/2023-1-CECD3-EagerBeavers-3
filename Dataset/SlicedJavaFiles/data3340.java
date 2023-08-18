public class Main{    public static void main(final String[] args) throws IOException {
        try(Scanner scan = new Scanner(System.in);
            PrintWriter print = new PrintWriter(System.out)) {
            final int n = scan.nextInt();
            final int m = scan.nextInt();
            final Pair<Integer, Integer>[] arcs = new Pair[m];
            for(int k = 0; k < m; ++k) {
                int i = scan.nextInt();
                int j = scan.nextInt();
                --i; --j;
                arcs[k] = new Pair(i, j);
            }
            print.println(calcMinNumStepsToCenterPermGraph(new DirectedGraph(n, arcs)));
        }
    }
}