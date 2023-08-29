public class Main{	public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt(), tt = 0;
        while(t-->0) { 
        	int n = in.nextInt();
        	if(n%2!=0) out.println("NO");
        	else{
        		n/=2;
        		if(Math.sqrt(n)==Math.ceil(Math.sqrt(n))) out.println("YES");
        		else{
        			if(n%2!=0) out.println("NO");
        			else{
        				n/=2;
            		if(Math.sqrt(n)==Math.ceil(Math.sqrt(n))) out.println("YES");
            		else out.println("NO");
        			}
        		}
    	    }
    		//tt++; out.println("Case #"+tt+": "+ans);
        }
        out.flush();
	}
}