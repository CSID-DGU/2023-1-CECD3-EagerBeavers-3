public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt(); a = new char[N];
		for(int i = 0; i < N; i++) a[i] = sc.nextChar();
		
		if(N == 1){out.println(1); out.flush(); return;}
		memo = new int[N][N + 5];
		for(int[] a : memo) Arrays.fill(a, -1);
		
		out.println(dp(0, 1));
		out.flush();
		out.close();
	}
}