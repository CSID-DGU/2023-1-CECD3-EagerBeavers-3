public class Main{    public static void main (String args[]) throws IOException {
//    	scan = new MyScanner(new BufferedReader(new FileReader("test.in")));
    	scan = new MyScanner(new BufferedReader(new InputStreamReader(System.in)));
    	out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        Main inst = new Main();
        inst.execute();
        out.close();
    }
}