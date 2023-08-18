public class Main{	public static void main(String[] args)throws Throwable {
		MyScanner sc=new MyScanner();
		PrintWriter pw=new PrintWriter(System.out);
		
		n=sc.nextInt();
		s=new char [n];
		for(int i=0;i<n;i++)
			s[i]=sc.next().charAt(0);
		mem=new int [2*n+1][n+1];
		for(int [] x : mem)
			Arrays.fill(x, -1);
		pw.println(dp(0, 0));
		
		pw.flush();
		pw.close();
	}
}