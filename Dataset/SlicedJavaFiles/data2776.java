public class Main{    public static void main(String args[]) {
        FastScanner scn = new FastScanner();
        int n = scn.nextInt();
        int s = scn.nextInt();
        if (s <= n) {
            System.out.println(1);
        } else if (s > n) {
            if(s%n == 0){
                System.out.println(s/n);
            } else {
                System.out.println(s/n + 1);
            }
        }

    }
}