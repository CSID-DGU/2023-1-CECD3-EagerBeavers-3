public class Main{    public static void main(String[] args) {

        try {
            in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
            ins = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            out = new PrintWriter(System.out);
            try {
                if (System.getProperty("xDx") != null) {
                    in = new StreamTokenizer(new BufferedReader(new FileReader("input.txt")));
                    ins = new Scanner(new FileReader("input.txt"));
                    out = new PrintWriter(new FileWriter("output.txt"));
                }
            } catch (Exception e) {
                in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
                ins = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
                out = new PrintWriter(System.out);
            }
            new Main().run();
        } catch (Throwable e) {
//            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            out.close();
        }
    }
}