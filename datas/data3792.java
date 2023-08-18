public class Main{  public static void main(String[] args) {
    StringBuilder solution = new StringBuilder();
    int rows = FR.nextInt();
    int cols = FR.nextInt();
    int moves = FR.nextInt();

    List<List<Integer>> horizontalEdgeWeights = new ArrayList<List<Integer>>(rows);
    for (int r = 0; r < rows; r++) {
      horizontalEdgeWeights.add(new ArrayList<Integer>(cols-1));

      for (int c = 0; c < cols - 1; c++) {
        horizontalEdgeWeights.get(r).add(FR.nextInt());
      }
    }

    List<List<Integer>> verticalEdgeWeights = new ArrayList<List<Integer>>(rows-1);
    for (int r = 0; r < rows - 1; r++) {
      verticalEdgeWeights.add(new ArrayList<Integer>(cols));

      for (int c = 0; c < cols; c++) {
        verticalEdgeWeights.get(r).add(FR.nextInt());
      }
    }
    
    List<List<Integer>> result = getResult(rows, cols, moves, horizontalEdgeWeights, verticalEdgeWeights);
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        int value = (result != null ? result.get(r).get(c) : -1);
        solution.append(value + " ");
      }
      solution.append("\n");
    }

		PW.print(solution.toString());
    PW.close();
  }
}