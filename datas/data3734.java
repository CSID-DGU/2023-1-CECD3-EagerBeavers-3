public class Main{    public static void main(String[] args) {
        new Thread(null, new SolutionE(), "Main", 1 << 26).start();
    }
}