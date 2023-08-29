public class Main{	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		int ans = 1000;
		in.readLine();
		String s = in.readLine();
		int H = 0;
		for(int i =0; i < s.length(); i++)
			if( s.charAt(i) == 'H') H++;

		
		for(int i = 0; i < s.length(); i++)
		{
			int count = 0;
			for(int j = 0; j < H; j++)
				if( s.charAt( (i +j) % s.length()) =='T') count ++;
			ans = Math.min ( ans, count);
		}
		System.out.println(ans);

	}
}