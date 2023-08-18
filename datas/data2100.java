public class Main{    public static void main(String[] args) throws IOException {
    	if (isStream) {
            br = new BufferedReader(new InputStreamReader(System.in));
        } else {
            br = new BufferedReader(new FileReader("in.txt"));
        }
        out = new PrintWriter(System.out);
        new Thread(new Solution()).start();
    }
}