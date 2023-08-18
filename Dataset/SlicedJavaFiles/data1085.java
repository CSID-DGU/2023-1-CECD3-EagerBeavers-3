public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        System.err.println(f(1));


//        System.err.println(f(4));
        int tc = sc.nextInt();
        out: while(tc-->0){
            long n = sc.nextInt();

            long k = sc.nextLong();
            if(n >= 32){
                pw.println("YES " + (n-1));
                continue;
            }

            long steps = 0;
            for (int i = 1;; i++) {
                long cnt = ((1l<<(i+1))-1);
                steps += ((1l<<(i))-1);
                if(steps > k)
                    break;
                if(steps > f(n))
                    break;
//                long rem = k-((1<<i)-1);
                long rem = k-steps;
//                System.err.println("steps:" + steps + " cnt:" + cnt + " f:"  + f(n-i));
//                System.err.println("rem: " + (f(n) - steps - cnt*f(n-i)));
                if(rem <= f(n) - steps - cnt*f(n-i)){
                    pw.println("YES " + (n-i));
                    continue out;
                }
            }

            pw.println("NO");
        }


        pw.flush();
        pw.close();
    }
}