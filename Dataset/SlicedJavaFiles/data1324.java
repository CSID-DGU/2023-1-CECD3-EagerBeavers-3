public class Main{    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long x = sc.nextLong(), k = sc.nextLong();
        if(x == 0)
            out.println(0);
        else
            out.println(((x % MOD * 2 - 1 + MOD) % MOD * modPow(2, k) % MOD + 1) % MOD);
        out.close();
    }
}