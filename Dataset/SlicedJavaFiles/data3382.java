public class Main{    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        word = in.next();
        if (word.length() == 1) {
            System.out.println(0);
            return;
        }
        for (int i = word.length() - 1; i > 0; i--) {
            int j = 0;
            while (j + i <= word.length()) {
                check(word.substring(j, i+j));
                j++;
            }
        }
        System.out.println(0);
    }
}