public class Main{	public static void main(String[] args) throws IOException {
		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		out = new PrintWriter(System.out);
		
		String s = nextString();
		
		for (int i = s.length(); i > 0; i--) {
			for (int j = 0; j+i-1 < s.length(); j++)
				for (int k = j+1; k+i-1 < s.length(); k++)
					if (s.substring(j, j+i).equals(s.substring(k, k+i))) {
						out.println(i);
						out.flush();
						return;
					}
		}
		
		out.println("0");
		
		out.flush();
	}
}