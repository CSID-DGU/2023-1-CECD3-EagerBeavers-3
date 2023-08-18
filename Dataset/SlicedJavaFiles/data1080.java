public class Main{    public static void main(String args[]) throws Exception {
        new Thread(null, new Solution(),"Main",1<<26).start();
    }    public void run() {
      InputReader sc  = new InputReader(System.in);
      PrintWriter out = new PrintWriter(System.out);
      int t1 = sc.nextInt();
      while(t1-->0)
      {
        int n = sc.nextInt();
        long k = sc.nextLong();
        if(n>31)
        {
            out.println("YES "+(n-1));
            continue;
        }
        int steps = bsearch(n,k);
        if(steps==0)
        {
            if(k==0)
                out.println("YES "+n);
            else
                out.println("NO");
        }
        if(valid(n,k,steps))
        {
            out.println("YES "+(n-steps));
        }
        else
        {
            out.println("NO");
        }
      }
      out.close();
  }
}