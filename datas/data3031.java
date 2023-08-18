public class Main{    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int i = -1;
        boolean ehLuck = false;
        preencheLucky();
        while (n >= luck[++i]) {
            if (i > 13) {
                break;
            }
            if (n % luck[i] == 0) {
                ehLuck = true;
                break;
            }
        }
        if (ehLuck) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}