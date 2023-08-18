public class Main{    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        
           prime  = new boolean[n + 1];
sieve();
                prime[1] = false;
         
          
             long n = sc.nl();
             long k = sc.nl();
             long b = 2*n + 3;
             long c = n*n - 2*k + n;
             long q1 = (b + (long)Math.sqrt(b*b - 4*c))/2;
             long q2 = (b - (long)Math.sqrt(b*b - 4*c))/2;
             if(q1 >= q2 && q1 <= n)
                 w.println(q1);
             else
                 w.println(q2);
                 
                
       
             
       w.close();
        
    }
}