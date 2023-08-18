public class Main{	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// streams
		boolean file = false;
		if (file)
			in = new BufferedReader(new FileReader("input.txt"));
		else
			in = new BufferedReader(new InputStreamReader(System.in));
		// out = new BufferedWriter(new OutputStreamWriter(System.out));
		out = new BufferedWriter(new FileWriter("output.txt"));
		StringTokenizer tok;

		int n = Integer.parseInt(in.readLine());
		if (n % 2 == 0)
			System.out.println(4 + " " + (n-4));
		else
			System.out.println(9 + " " + (n-9));
	}
}