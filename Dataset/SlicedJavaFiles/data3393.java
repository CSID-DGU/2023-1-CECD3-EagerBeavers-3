public class Main{    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.replaceAll("\\s+", " ");
        System.out.println(lrs(s).length());
    }
}