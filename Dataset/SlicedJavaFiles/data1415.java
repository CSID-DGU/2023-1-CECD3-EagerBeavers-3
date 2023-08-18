public class Main{    public static void main(String[] args) {
        PipelineSolver solver = new PipelineSolver();

        solver.readData();
        int solution = solver.solve();
        solver.print(solution);
    }
}