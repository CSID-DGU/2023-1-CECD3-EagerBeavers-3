public class Main{    public static void main(String[] args) throws Exception {
        try (InputProvider input = new InputProvider(System.in);
             PrintWriter output = new PrintWriter(System.out)) {
            new Main().solve(input, output);
        }
    }
}