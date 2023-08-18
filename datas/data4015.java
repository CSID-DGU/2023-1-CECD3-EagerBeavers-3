public class Main{	public static void main (String[] args) throws java.lang.Exception
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		
		n = in.nextInt();
		int T = in.nextInt();
		
		t = new int[n];
		g = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			t[i] = in.nextInt();
			g[i] = in.nextInt() - 1;
		}
		
		memo = new int[4][1 << n];
		for(int []x : memo)
		{
			Arrays.fill(x, -1);
		}
		
		out.println(dp(0, T, 3));
		out.close();
	}
}