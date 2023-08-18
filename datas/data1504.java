public class Main{	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		long L = nextLong();
		long R = nextLong();
		if (L==R) {
			System.out.println(0);
			return;
		}
		String s1 = Long.toBinaryString(L), s2 = Long.toBinaryString(R);
		while (s1.length() != s2.length())
			s1 = "0"+s1;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				int pow = s1.length()-i;
				System.out.println((long)Math.pow(2, pow)-1);
				return;
			}
		}
		pw.close();
	}
}