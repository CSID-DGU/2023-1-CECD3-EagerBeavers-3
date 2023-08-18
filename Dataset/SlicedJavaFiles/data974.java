public class Main{      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         //bin search
         //ugh I'm shafting
         long x = (long)N;
         long low = 0L;
         long high = N;
         while(low != high)
         {
            x = (low+high+1)/2;
            long add = (x*(x+1))/2;
            long y = N-x;
            if(add-y > K)
               high = x;
            else if(add-y == K)
            {
               System.out.println(y);
               break;
            }
            else
               low = x;
         }
         //run time?
      }
}