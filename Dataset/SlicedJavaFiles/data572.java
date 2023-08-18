public class Main{	public static void main(String[] args) {
		PrintWriter out=new PrintWriter(System.out);
    	Scanner s=new Scanner(System.in);  
    	int t=s.nextInt();
    	for(int tt=0;tt<t;tt++) {
    		long n=s.nextInt();
    		long x=(long)Math.sqrt(n/2);
    		long y=(long)Math.sqrt(n/4);
    		if(x*x*2==n || y*y*4==n) {
    			out.println("YES");
    		}else {
    			out.println("NO");
    		}
    	}
    	out.close();
	    s.close();
	}
}