public class Main{    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Start writing your solution here. -------------------------------------



        /*fac = new long[nn + 1];
        fac[1] = 1;
        for(int i = 2; i <= nn; i++)
            fac[i] = fac[i - 1] * i % MOD;*/


        /*pow2 = new long[nn + 1];
        pow2[0] = 1L;
        for(int i = 1; i <= nn; i++)
            pow2[i] = pow2[i - 1] * 2L;*/


        /*inv = new long[nn + 1];
        inv[1] = 1;
        for (int i = 2; i <= nn; ++i)
            inv[i] = (MOD - MOD / i) * inv[(int)(MOD % i)] % MOD;*/

        /*facInv = new long[nn + 1];
        facInv[0] = facInv[1] = 1;
        for (int i = 2; i <= nn; ++i)
            facInv[i] = facInv[i - 1] * inv[i] % MOD;*/


        /*numOfDiffDiv = new int[nn + 1];
        for(int i = 2; i <= nn; i++)
            if(numOfDiffDiv[i] == 0)
                for(int j = i; j <= nn; j += i)
                    numOfDiv[j] ++;*/

        /*numOfDiv = new int[nn + 1];
        numOfDiv[1] = 1;
        for(int i = 2; i <= nn; i++) {
            for(int j = 2; j * j <= i; j++) {
                if(i % j == 0) {
                    numOfDiv[i] = numOfDiv[i / j] + 1;
                    break;
                }
            }
        }*/

        //primes = sieveOfEratosthenes(100001);

        /*
        int t = 1;
        //t = sc.ni();
        while(t-- > 0) {
            //boolean res = solve();
            //out.println(res ? "YES" : "NO");
            long res = solve();
            out.println(res);
        }*/


        int t = 1, tt = 0;
        //t = sc.ni();
        for(int i = 1; i <40000; i++) squares.add(i * i);
        while(tt++ < t) {
            boolean res = solve();
            //out.println("Case #" + tt + ": " + res);
            //out.println(res ? "YES" : "NO");
        }
        out.close();
    }
}