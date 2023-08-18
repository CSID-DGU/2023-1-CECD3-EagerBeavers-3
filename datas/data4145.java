public class Main{    public static void main(String[] argv) {
        Main solved = new Main();
        int T = 1;
        // T = solved.cin.nextInt();
        for (int nT = 1; nT <= T; ++nT) {
            solved.run(nT);
        }
        solved.out.close();
    }
}