public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] params = Arrays.stream(br.readLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();
        n = params[0];
        int m = params[1];
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(x -> Integer.parseInt(x)).toArray();
        }
        minCost = new int[n][n];
        minCostEndpoints = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    minCost[i][j] = Integer.MAX_VALUE;
                    for (int k = 0; k < m; k++) {
                        int diff = Math.abs(matrix[i][k] - matrix[j][k]);
                        if (diff < minCost[i][j]) {
                            minCost[i][j] = diff;
                        }
                    }
                    minCost[j][i] = minCost[i][j];
                }
                minCostEndpoints[i][j] = Integer.MAX_VALUE;
                for (int k = 0; k < m - 1; k++) {
                    int diff = Math.abs(matrix[i][k + 1] - matrix[j][k]);
                    if (diff < minCostEndpoints[i][j]) {
                        minCostEndpoints[i][j] = diff;
                    }
                }
            }
        }
        int maxCost = n == 1 ? minCostEndpoints[0][0] : 0;
        for (int i = 0; i < n; i++) {
            costs.clear();
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int bitmask = (1 << i) | (1 << j);
                    int state = bitmask + (j << 16);
                    costs.put(state, minCost[i][j]);
                }
            }
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (minCostEndpoints[i][j] <= maxCost) {
                        continue;
                    } else {
                        int pathCost = Math.min(minCostEndpoints[i][j], findMaxCost(i, j, (1 << n) - 1));
                        maxCost = Math.max(maxCost, pathCost);
                    }
                }
            }
        }
        System.out.println(maxCost);
        br.close();
    }
}