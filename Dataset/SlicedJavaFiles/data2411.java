public class Main{	public static void main(String[] args){
		FastScanner scan = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = scan.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i <= n; i++) a[i] = scan.nextInt();
		BIT bit = new BIT(n);
		int p = 0;
		for(int i = 1; i <= n; i++) {
			p ^= bit.atOrAbove(a[i])&1;
			bit.add(a[i], 1);
		}
		int m = scan.nextInt();
		for(int i = 0; i < m; i++) {
			int l = scan.nextInt(), r = scan.nextInt();
			int s = r-l+1;
			int in = s*(s-1)/2;
			if((in&1) == 1) p ^= 1;
			out.println(p==0?"even":"odd");
		}
		out.close();
	}
}