public class Main{    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        if (!useFiles) {
            inputReader = new InputReader(System.in, 1<<16);
            outputWriter = new BufferedWriter(new OutputStreamWriter(System.out), 1<<16);
        } else {
            inputReader = new InputReader(new FileInputStream(new File(inFile)), 1<<16);
            outputWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(outFile))), 1<<16);
        }
        new A().solve();
        outputWriter.flush(); outputWriter.close();
    }
}