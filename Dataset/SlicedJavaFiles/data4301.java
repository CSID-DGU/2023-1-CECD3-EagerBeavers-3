public class Main{    public static void main(String[] args) throws Exception{
        // sc = new Scanner(System.in);
        sc = (new Main()).new myScanner(new BufferedReader(new InputStreamReader(System.in)));
        pw = new PrintWriter(System.out);
        startTime = System.nanoTime();
        (new Main()).go();
        // errprintln("nanoTime="+(System.nanoTime()-startTime)/1000000/1000.0);
        pw.flush();
        System.exit(0);
    }
}