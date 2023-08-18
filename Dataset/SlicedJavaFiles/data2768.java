public class Main{	public static void main(String[] args) throws IOException {
		InputReader sc = new InputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = sc.nextInt();

		if(n < 3)
			out.println(n);
		else
		{
			if((n & 1) == 1)
				out.println(lcm(n, lcm(n - 1, n - 2)));
			else
				out.println(Math.max(lcm(n - 1, lcm(n - 2, n - 3)), lcm(n, lcm(n - 1, n - 3))));
		}
		out.flush();
		out.close();
	}
}