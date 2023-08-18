public class Main{    public static void main(String[] args) {
        sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        int t = 1;
        if (true) {
            t = sc.nextInt();
        }
        for(int i=0; i<t; i++) {
            new Main().solve();
        }
        out.flush();
    }
}