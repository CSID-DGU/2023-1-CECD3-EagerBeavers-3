public class Main{    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if( N%2 == 0) {
            System.out.println( (4)+" "+(N-4));
        }
        else System.out.println( (9)+" "+(N-9));
        scan .close();
    }
}