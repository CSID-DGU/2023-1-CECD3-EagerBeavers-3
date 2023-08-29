public class Main{    public static void main(String[] args) throws Exception {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new PrintWriter(System.out);

        setTime();
        solve();
        printTime();
        printMemory();

        writer.close();
    }
}