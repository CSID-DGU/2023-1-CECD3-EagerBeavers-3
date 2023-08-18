public class Main{  public static void main(String[] args) throws IOException {
    StringBuilder solution = new StringBuilder();
    int rows = FR.nextInt();
    int cols = FR.nextInt();
    int moves = FR.nextInt();

    Map<Integer, Integer> horizontalEdgeWeights = new HashMap<Integer, Integer>();
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols - 1; c++) {
        int hash = getHash(r, c);
        horizontalEdgeWeights.put(hash, FR.nextInt());
      }
    }

    Map<Integer, Integer> verticalEdgeWeights = new HashMap<Integer, Integer>();
    for (int r = 0; r < rows - 1; r++) {
      for (int c = 0; c < cols; c++) {
        int hash = getHash(r, c);
        verticalEdgeWeights.put(hash, FR.nextInt());
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

		BW.write(solution.toString());
    BW.close();
  }
}