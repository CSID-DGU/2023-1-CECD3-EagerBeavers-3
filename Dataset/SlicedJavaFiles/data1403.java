public class Main{    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long k = input.nextLong();
        System.out.println(solve(n, k));
        input.close();
    }
}