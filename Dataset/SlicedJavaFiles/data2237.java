public class Main{	public static void main(String[] args){
		FastScanner scan = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		n = scan.nextInt(); mod = (int)1e9+7;
		in = new char[n];
		for(int i = 0; i < n; i++) in[i] = scan.next().charAt(0);
		dp = new Long[n][n];
		out.println(go(0, 0));
		out.close();
	}
}