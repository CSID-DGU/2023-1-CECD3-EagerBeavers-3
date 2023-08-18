public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long answer = solve(N, 0, 1, 1);
        System.out.println(answer);
    }
}