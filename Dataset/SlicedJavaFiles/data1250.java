public class Main{    public static void main(String args[]) throws Exception{
        FastInput fi = new FastInput(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        x = fi.nextLong();
        k = fi.nextLong();

        if(x == 0) {
            System.out.println(0);
            return;
        }

//        System.out.println(pow(2, k+1));
        long q1 = (pow(2, k+1) * (x%MOD)) % MOD;
        long q2 = pow(2, k);
        long q3 = 1;
//        System.out.println(q1);
//        System.out.println(q2);
//        System.out.println(q3);


        long exp = (q1-q2 + MOD + MOD)%MOD;
        exp = (exp + q3)%MOD;

//        exp = (exp*2)%MOD;

        pw.println(exp);

        pw.close();
    }
}