public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		n=sc.nextInt();
		int T=sc.nextInt();
		t=new int [n];
		g=new int [n];
		
		for(int i=0;i<n;i++) {
			t[i]=sc.nextInt();
			g[i]=sc.nextInt()-1;
		}
		memo=new int [4][1<<n];
		for(int []x:memo)
			Arrays.fill(x, -1);
		out.println(dp(0, T, 3));
		out.close();

	}
}