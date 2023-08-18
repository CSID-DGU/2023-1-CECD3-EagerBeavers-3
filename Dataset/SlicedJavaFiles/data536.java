public class Main{	public static void main(String[] args) throws Exception {
		
		PrintWriter out=new PrintWriter(System.out);
	    FastScanner fs=new FastScanner();
	    int t=fs.nextInt();
	    while(t-->0) {
	    	double n=fs.nextInt();
	    	if(isp(n/2)||isp(n/4)) {
	    		System.out.println("YES");
	    	}
	    	else System.out.println("NO");
	    }
	}
}