public class Main{    public static void main(String[] args) {

        File file = new File("in.txt");
        File fileOut = new File("out.txt");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        // try {inputStream= new FileInputStream(file);} catch (FileNotFoundException ex){return;};
//        try {outputStream= new FileOutputStream(fileOut);} catch (FileNotFoundException ex){return;};
        inputStream = System.in;
        outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}