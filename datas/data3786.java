public class Main{    public static void main(String[] args) throws Exception {
        if (isOnlineJudge()) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new BufferedWriter(new OutputStreamWriter(System.out));
            new ExplorerSpace().solve();
            out.flush();
        } else {
            Thread judge = new Thread();
            in = new BufferedReader(new FileReader("input.txt"));
            out = new BufferedWriter(new FileWriter("output.txt"));
            judge.start();
            new ExplorerSpace().solve();
            out.flush();
            judge.suspend();
        }
    }
}