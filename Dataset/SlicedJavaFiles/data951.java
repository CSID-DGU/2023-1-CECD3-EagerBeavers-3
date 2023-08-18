public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt(),k=sc.nextInt();
		for(int x=0;;x++) {
			if(2*1L*x+x*1L*(x+1)==2L*(k+n)) {
				out.println(n-x);
				break;
			}
		}
		out.close();

	}
}