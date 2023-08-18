public class Main{    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                                            //(new FileReader("input.in"));
        StringBuilder out = new StringBuilder();
        StringTokenizer tk;
        //PrintWriter pw = new PrintWriter("output.out", "UTF-8");
  
        long n = parseLong(in.readLine());
        
        if(n <= 2) System.out.println(n);
        else if(n%2 == 1)System.out.println(n*(n-1)*(n-2));
        else {
            long ans = (n-1)*(n-2)*(n-3);
            
            if(gcd(n*(n-1),n-3)==1) ans = max(ans, n*(n-1)*(n-3));
            
            System.out.println(ans);
        }
    }
}