public class Main{	public static void main(String[] args) 
	{ 
        FastReader sc = new FastReader(); 
        //PrintWriter out = new PrintWriter(System.out); 
        double n = (double)sc.nextLong();
        double k = (double)sc.nextLong();
        
        double div = 9+8*n+8*k;
        double ss = Math.sqrt(div);
        //System.out.println(ss);

        ss =  (ss-3)/2;
        System.out.println( (int)(n-ss) );
	}
}