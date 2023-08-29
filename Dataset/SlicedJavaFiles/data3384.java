public class Main{    public static void main(String[] args) throws Exception {
        final String str;
        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        str = r.readLine();

        int max = 0;

        for (int x = 0; x  < str.length(); x++) {
            for (int y = x + 1; y  < str.length(); y++) {
                int c = 0;
                for (;c + x < str.length() && y + c < str.length(); c++) {
                    if (str.charAt(x + c) != str.charAt(y + c)) {
                        break;
                    }
                }

                if (c > max) {
                    max = c;
                }
            }
        }

        System.out.println(max);
    }
}