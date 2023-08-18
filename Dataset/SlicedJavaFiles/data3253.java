public class Main{    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(System.out);
        new Task(new InputReader(System.in), writer).solve();
        writer.close();
    }
}