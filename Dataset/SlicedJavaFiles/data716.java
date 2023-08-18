public class Main{    public static void main (String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        while (n-- > 0) {
            String s = b.readLine();
            if (s.matches("^[A-Z]+[0-9]+$")) {
                System.out.println(toRC(decodeCR(s)));
            } else {
                System.out.println(toCR(decodeRC(s)));
            }
        }
    }
}