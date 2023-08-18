public class Main{	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0) {
			n=sc.nextInt();m=sc.nextInt();
			in=new int[n][m];
			for(int i=0;i<n;i++)in[i]=sc.intArr(m);
			memo=new int[m][1<<n];
			for(int i=0;i<m;i++)Arrays.fill(memo[i], -1);
			pw.println(dp(0, 0));
		}
		
		
		pw.flush();
	}
}