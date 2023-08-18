public class Main{    public static void main(String[] args) {
        C2 sol = new C2();
        try {
            sol.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}