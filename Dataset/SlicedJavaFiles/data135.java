public class Main{    public static void main(String[] args) throws IOException {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = inp.readLine().split(" ");
        long clothes = Long.parseLong(s1[0]);
        long months = Long.parseLong(s1[1]);

        //formula 2^k(2x-1)+1;
        calc(clothes,months);
        System.out.print(ans);
    }
}