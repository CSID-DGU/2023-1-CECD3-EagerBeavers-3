public class Main{    public static void main(String[] args) throws IOException {
        if(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            System.out.println(solve(s));
        }
        else {
            for(int i = 0; i < EX.length; ++i) {
                int result = solve(EX[i]);
                System.out.println(i + ": " + result + " " + (result == EX_A[i]? "ja" : "NEJ"));
            }
        }
    }
}