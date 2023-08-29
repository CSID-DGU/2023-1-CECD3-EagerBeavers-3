public class Main{	public static void main(String[] args) throws IOException {
		bf = new BufferedReader(new InputStreamReader(System.in));
    	tokenizer = null;
    	out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    	int n = nextInt();
    	if(n >= 0) out.println(n);
    	else {
    		n = -n;
    		int a = n % 10; int m = n/10;
    		int b = m % 10;
    		if(a >= b) {
    			if(m == 0) out.println(0);
    			else out.println(-m);
    		}
    		else {
    			m = (m-b)+a;
    			if(m == 0) out.println(0);
    			else out.println(-m);
    		}
    	}
    	out.close();
	}
}