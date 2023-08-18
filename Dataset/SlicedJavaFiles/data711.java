public class Main{	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
//		BufferedReader input = new BufferedReader(new FileReader("input.txt"));
//		PrintWriter output = new PrintWriter(new FileWriter("output.txt"));
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter output = new PrintWriter(new OutputStreamWriter(System.out));
		StreamTokenizer in = new StreamTokenizer(input);
		in.nextToken();
		int n = (int)in.nval;
		
		for (int i = 0; i < 26; i++) 
		{
			val.put((char)('A' + i), i + 1);
		}
		
		for (int i = 0; i < 26; i++) 
		{
			ch.put(i + 1, (char)('A' + i));
		}
		
		input.readLine();
		for (int i = 0; i < n; i++) {
			s = input.readLine();
			int cpos;
			if( ((cpos = s.indexOf('C')) > 1) && (isDigit(s.charAt(cpos - 1))) ) 
			{
				output.println(RCtoAB(cpos)); 
			}
			else
			{
				output.println(ABtoRC(cpos));
			}
		}
		
		output.close();
		input.close();
	}
}