public class Main{    public static void main(String[] args) {
        InputScanner scanner = new InputScanner();
        try {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            if ((r - l) < 2) {
                System.out.println("-1");
                return;
            }

            if (l % 2 == 0) {
                long a = l;
                long b = l + 1;
                long c = l + 2;
                System.out.println(a + " " + b + " " + c);
            } else if (r%2==0){
                long a = r;
                long b = r-1;
                long c = r-2;
                System.out.println(c + " " + b + " " + a);
            } else {
                l++;
                if ((r - l) < 2) {
                    System.out.println("-1");
                    return;
                }
                long a = l;
                long b = l + 1;
                long c = l + 2;
                System.out.println(a + " " + b + " " + c);
            }
        } catch (IOException e) {

        }


    }
}