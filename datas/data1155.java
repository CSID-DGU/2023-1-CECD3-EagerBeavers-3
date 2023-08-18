public class Main{	public static void main(String args[]) {
		InputReader in = new InputReader(System.in);
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		/*------------------------------My Code starts here------------------------------*/
		long n=in.nextLong(),s=in.nextLong();
		long x=BS(0,n,s);
		out.print(n-x+1);
		out.close();
		/*------------------------------The End------------------------------------------*/
	}
}