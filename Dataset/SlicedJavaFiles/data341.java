public class Main{    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        //final String FILENAME = "jury"; in = new Scanner (new File (FILENAME + ".in")); out = new PrintWriter (new File(FILENAME + ".out"));
    //    in = new Scanner (System.in); out = new PrintWriter (System.out);
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        st = new StringTokenizer(" ");
        new Main().run();
        /*out = new PrintWriter (System.out);
        final int NUMBER_OF_TESTS = 35;
        for (int i = 1; i <= NUMBER_OF_TESTS; i++) {
            Scanner test = new Scanner (new File ("tests/" + i + ".in"));
            Scanner right = new Scanner (new File ("tests/" + i + ".out"));
            String get_right = right.nextLine();
            String get_test = new Main().run(test);
            if (get_right.equals(get_test)) {
                out.println("Test #" + i + ": " + "OK!");                
            } else {
                out.println("Test #" + i + ": " + "ERROR!");
                out.println("Expected: " + get_right);
                out.println("Received: " + get_test);
                break;
            }
        }*/
        out.close();
    }
}