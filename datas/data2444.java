public class Main{    public static void main(String[] args) throws Exception {
        long startPointTime = System.currentTimeMillis();
        scannerIn = System.in;
        printerBW = new BufferedWriter(new OutputStreamWriter(System.out));
        if (args.length > 0 && args[0].equalsIgnoreCase("debug")
                || args.length > 1 && args[1].equalsIgnoreCase("debug"))
            DEBUG = true;

        main2();
        long endTime = System.currentTimeMillis();
        float totalProgramTime = endTime - startPointTime;
        if (args.length > 0 && args[0].equalsIgnoreCase("time") || args.length > 1 && args[1].equalsIgnoreCase("time"))
            print("Execution time is " + totalProgramTime + " (" + (totalProgramTime / 1000) + "s)");
        close();
    }
}