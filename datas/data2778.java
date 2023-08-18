public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long a,b;
        while(t-- > 0){
            a = in.nextLong();
            b = in.nextLong();
            System.out.println(_solve(a,b));
        }
    }
}