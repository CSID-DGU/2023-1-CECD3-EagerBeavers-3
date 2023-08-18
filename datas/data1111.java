public class Main{    public static void main(String[] args) throws IOException {
    	
		
//    	FastScanner fs = new FastScanner();
//    	PrintWriter out = new PrintWriter(System.out);
    		
    	int tt = 1;
    	while(tt-->0) {
    		
    	
    		n = fs.nextInt();
    		int l = 1, r = 1 + n/2;
    		
    		d = getB(l);
    		if(d%2!=0) {
    			out.println("! -1");
    			out.flush();
    			return;
    		}
    		
    		if(d==0) {
    			out.println("! 1");
    			out.flush();
    			return;
    		}
    		
    		
    		
    		
    		
    		
    		
    		while(l<r) {
    			int mid = (l+r)/2;
    			if(check(mid)) {
    				l = mid + 1;
    			}
    			else {
    				r = mid;
    			}
    			int f = 1;
    		}
    		
    		
    		out.println("! "+l);
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    	}
    	
    	out.close();
    		
    }
}