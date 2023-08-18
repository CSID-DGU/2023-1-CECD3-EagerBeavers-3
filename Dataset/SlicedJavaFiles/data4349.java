public class Main{    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)
        ) {
            new D().run(in, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}