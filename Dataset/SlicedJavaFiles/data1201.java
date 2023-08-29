public class Main{    public static void main(String[] args) throws IOException {

        final Scanner reader = new Scanner(new InputStreamReader(debugMode ? System.in : new FileInputStream(FILE_IN)));
        final PrintWriter writer = new PrintWriter(debugMode ? System.out : new FileOutputStream(FILE_OUT));

//        final long start = System.currentTimeMillis();
        solveTheProblem(reader, writer);
//        System.out.println(System.currentTimeMillis() - start);

        reader.close();
        writer.close();
    }
}