public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        char[]data = new char[n];
        dp = new long[n][n];
        for(long []a : dp){
            Arrays.fill(a,-1);
        }
        for(int i = 0; i < n; i++){
            data[i] = in.next().charAt(0);
        }
        out.println(cal(0, 0, data));

        out.close();
    }
}