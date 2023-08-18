public class Main{	public static void main(String[] args) throws IOException	{
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int qq = readInt();
		while(qq-- > 0)	{
			pw.println(solve(readInt(), readInt()));
		}
		pw.close();
	}
}