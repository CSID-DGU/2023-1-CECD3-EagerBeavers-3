public class Main{    public static void main(String[] args) {
        solver s = new solver();
        int t = 1;
        while (t > 0) {
            s.solve();
            t--;
        }
        out.close();
    }
}