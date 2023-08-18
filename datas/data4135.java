public class Main{    public static void main(String [] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String [] pieces = scanner.readLine().split("\\s+");

        //totally had to steal the vast majority of this from http://codeforces.com/contest/8/submission/9745593

        Point origin = new Point(Integer.parseInt(pieces[0]), Integer.parseInt(pieces[1]));

        N = Integer.parseInt(scanner.readLine());

        Point [] points = new Point[N + 1];
        distances = new int[N  + 1][N + 1];
        parents = new int[N + 1][N + 1];
        longNames = new String[N][N];
        shortNames = new String[N];

        for (int i = 0; i < N; ++i) {
            pieces = scanner.readLine().split("\\s+");

            points[i] = new Point(Integer.parseInt(pieces[0]), Integer.parseInt(pieces[1]));
        }

        points[N] = origin;

        for (int i = 0; i <= N; ++i) {
            if (i < N) {
                shortNames[i] = (i + 1) + " ";
            }

            for (int j = 0; j <= N; ++j) {
                if (i < N && j < N) {
                    longNames[i][j] = (i + 1) + " " + (j + 1) + " ";
                }

                distances[i][j] = 2 * points[i].distance(points[j]);
                parents[i][j] = points[i].distance(points[N]) + points[i].distance(points[j]) + points[j].distance(points[N]);
            }
        }

        distance = new int[1 << N];
        parent = new int[1 << N];
        answers = new String[1 << N];
        Arrays.fill(distance, -1);
        distance[0] = 0;

        int result = rec((1 << N) - 1);
        StringBuilder answer = new StringBuilder();

        for (int i = distance.length - 1; parent[i] != i; i = parent[i]) {
            answer.append("0 ");
            answer.append(answers[i]);
        }

        answer.append("0");
        System.out.println(result);
        System.out.println(answer.toString());
    }
}