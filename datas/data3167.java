public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String s = in.readLine();
		int n = Integer.parseInt(s);

		if (s.charAt(0) == '-')
			if (Integer.parseInt(s.substring(0, s.length()-1))>Integer.parseInt(s.substring(0, s.length()-2)+s.charAt(s.length()-1)))
				s=s.substring(0, s.length()-1);
			else
				s=s.substring(0, s.length()-2)+s.charAt(s.length()-1);

		System.out.println(Integer.parseInt(s));
		in.close();
	}
}