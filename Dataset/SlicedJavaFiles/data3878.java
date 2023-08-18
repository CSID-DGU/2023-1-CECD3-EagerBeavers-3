public class Main{    public static void main(String[] args) throws IOException {
    	
		
    	FastScanner fs = new FastScanner();
    	PrintWriter out = new PrintWriter(System.out);
  		
    	int tt = fs.nextInt();
    	outer:
    	while(tt-->0) {
    		
    		int n = fs.nextInt();
    		int[] a = fs.readArray(n);
    		
    		ArrayList<Integer>[] l = new ArrayList[n];
    		for(int i=0;i<n;i++) l[i] = new ArrayList<Integer>();
    		
    		l[0].add(1);
    		
    		for(int i=1;i<n;i++) {
    			if(a[i]==1) {
    				for(int j=0;j<l[i-1].size();j++) l[i].add(l[i-1].get(j));
    				l[i].add(1);
    			}
    			else {
    				int ind = -1;
    				for(int j=l[i-1].size()-1;j>=0;j--) {
    					if(l[i-1].get(j)+1==a[i]) {
    						ind = j; break;
    					}
    				}
    				for(int j=0;j<ind;j++) l[i].add(l[i-1].get(j));
    				l[i].add(a[i]);
    			}
    		}
    		
    		for(int i=0;i<n;i++) {
    			out.print(l[i].get(0));
    			for(int j=1;j<l[i].size();j++) out.print("."+l[i].get(j));
    			out.println();
    		}
    		
    		
    		
    		
    	}
    	
    	out.close();
    		
    	
    	
    }
}