public class Main{    public static void main(String args[]) throws IOException {
        if (args.length > 0) {
            setIn(new FileInputStream(args[0] + ".inp"));
            setOut(new PrintStream(args[0] + ".out"));
        }
        Main solver = new Main();
        solver.out.flush();  //  could be replace with a method, but nah, this is just competitive programming :p
    }
}