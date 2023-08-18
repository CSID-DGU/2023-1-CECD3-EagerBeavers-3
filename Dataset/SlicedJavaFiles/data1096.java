public class Main{    public static void main(String[] args) throws Exception {
        bf = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scan = new Scanner(System.in);
        out = new PrintWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(bf.readLine());
        a = new int[n];
        Arrays.fill(a, Integer.MAX_VALUE);
        if((n/2) % 2 != 0) {
          out.println("! " + (-1));
          out.flush();
          out.close(); System.exit(0);
        }

        ask(0);
        ask(opp(0));

        int low = 0;
        int high = opp(0);
        while(true) {
          int test = (low + high)/2;
          ask(test);
          ask(opp(test));
          int l_1 = a[low];
          int l_2 = a[test];
          int r_1 = a[opp(low)];
          int r_2 = a[opp(test)];
          if(1L*(l_1 - r_1)*(l_2 - r_2) < 0L) {
            high = test;
          }
          else low = test;
        }

        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());
        // int n = scan.nextInt();

        //out.close(); System.exit(0);
    }
}