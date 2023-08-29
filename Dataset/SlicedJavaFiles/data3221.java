public class Main{    	public static void main(String args[]){
    		InputReader in = new InputReader(System.in);
    		OutputStream outputStream = System.out;
    		PrintWriter out = new PrintWriter(outputStream);
    		//----------My Code Starts Here----------
    		long n=in.nextLong();
    		if(n==1){
    			System.out.println("5");
    		}
    		else{
    			System.out.println("25");
    		}
    		out.close();
    		//---------------The End------------------
    	}
}