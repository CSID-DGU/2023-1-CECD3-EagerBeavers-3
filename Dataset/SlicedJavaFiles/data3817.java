public class Main{  public static void main(String[] args) {
    StringBuilder solution = new StringBuilder();
    int rows = FR.nextInt();
    int cols = FR.nextInt();
    int moves = FR.nextInt();

    int[][] horizontalEdgeWeights = new int[rows][cols-1];

    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols - 1; c++) {
        horizontalEdgeWeights[r][c] = FR.nextInt();
      }
    }

    int[][] verticalEdgeWeights = new int[rows-1][cols];
    for (int r = 0; r < rows - 1; r++) {
      for (int c = 0; c < cols; c++) {
        verticalEdgeWeights[r][c] = FR.nextInt();
      }
    }

    int[][] result = getResult(rows, cols, moves, horizontalEdgeWeights, verticalEdgeWeights);
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        solution.append(result[r][c] + " ");
      }
      solution.append("\n");
    }

		PW.print(solution.toString());
    PW.close();
  }
}